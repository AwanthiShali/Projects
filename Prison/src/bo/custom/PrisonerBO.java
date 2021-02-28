package bo.custom;

import bo.SuperBO;
import dto.CrimeDTO;
import dto.CustomDTO;
import dto.PrisonerDTO;
import dto.SectionDTO;
import entity.Section;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PrisonerBO extends SuperBO {
    boolean addPrisoner(PrisonerDTO prisoner) throws ClassNotFoundException, SQLException, Exception;
    String getLastID() throws ClassNotFoundException, SQLException, Exception;
    ArrayList<String> getAllSection() throws Exception;
    String getSectionID(String name) throws ClassNotFoundException, SQLException, Exception;
    String getCourtDetailsID() throws ClassNotFoundException, SQLException, Exception;
    String getCrimeID(String crime) throws ClassNotFoundException, SQLException, Exception;
    ArrayList<String> getAllCrimes() throws Exception;
    ObservableList<CustomDTO> getAllCustoms(CustomDTO customDTO) throws Exception;
    boolean deletePrisoner(String pid) throws Exception;
}
