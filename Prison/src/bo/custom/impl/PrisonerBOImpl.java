package bo.custom.impl;

import bo.custom.PrisonerBO;
import bo.custom.SectionBO;
import dao.DAOFactory;
import dao.custom.*;
import dao.custom.impl.SectionDAOImpl;
import db.DBConnection;
import dto.*;
import entity.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrisonerBOImpl implements PrisonerBO {
    PrisonerDAO prisonerDAO= (PrisonerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PRISONER);
    SectionDAO sectionDAO= (SectionDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SECTION);
    CrimeDAO crimeDAO= (CrimeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CRIME);
    CourtDetailsDAO courtDetailsDAO= (CourtDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURTDETAILS);
    QueryDAO queryDAO= (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOM);
    @Override
    public boolean addPrisoner(PrisonerDTO prisoner) throws ClassNotFoundException, SQLException, Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        Prisoner pri = new Prisoner(prisoner.getPid(),prisoner.getSid(),prisoner.getSurname(),prisoner.getName(),prisoner.getDob(),prisoner.getAge(),prisoner.getRelative_name(),prisoner.getRelationship());
        boolean add =prisonerDAO.add(pri);
        try {
            if (add) {
                for (CourtDetailsDTO coD : prisoner.getAllCourtDetails()) {
                    Court_Details co_detail = new Court_Details(coD.getCoID(),coD.getCid(),coD.getPid(),coD.getPunishment(),coD.getPunished_day(),coD.getNextCo_day(),coD.getCo_time());
                    boolean response =courtDetailsDAO.add(co_detail);
                    if (!response) {
                        connection.rollback();
//                        connection.setAutoCommit(true);
                        return false;
                    }
                }
                connection.commit();
//                connection.setAutoCommit(true);
                return true;

            } else {
                connection.rollback();
//                connection.setAutoCommit(true);
                return false;

            }
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public String getLastID() throws ClassNotFoundException, SQLException, Exception {
        return prisonerDAO.getPrisonerLastId();
    }

    @Override
    public ArrayList<String> getAllSection() throws Exception {
        return sectionDAO.getSectionName();
    }

    @Override
    public String getSectionID(String name) throws ClassNotFoundException, SQLException, Exception {
        Section section=sectionDAO.search(name);
        String sid=section.getSid();
        return sid;
    }

    @Override
    public String getCourtDetailsID() throws ClassNotFoundException, SQLException, Exception {
        return courtDetailsDAO.getCourtDetailsLastId();
    }

    @Override
    public String getCrimeID(String crime) throws ClassNotFoundException, SQLException, Exception {
        Crime crimes=crimeDAO.search(crime);
        String sid=crimes.getCid();
        return sid;
    }

    @Override
    public ArrayList<String> getAllCrimes() throws Exception {
        return crimeDAO.getAllCrimes();
    }

    @Override
    public ObservableList<CustomDTO> getAllCustoms(CustomDTO customDTO) throws Exception {
        ObservableList<CustomEntity> custom= (ObservableList<CustomEntity>) queryDAO.getCourtDetailsFromPID(customDTO);
        ObservableList<CustomDTO> cDTO=FXCollections.observableArrayList();
        for(CustomEntity all:custom){
            CustomDTO dto=new CustomDTO(all.getPid(),all.getName(),all.getCoDetailId(),all.getNextCourtDate(),all.getNextCourtTime());
            cDTO.add(dto);
        }
        return cDTO;
    }

    @Override
    public boolean deletePrisoner(String pid) throws Exception {
        return prisonerDAO.delete(pid);
    }
}
