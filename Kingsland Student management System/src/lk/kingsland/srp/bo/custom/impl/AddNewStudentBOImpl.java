package lk.kingsland.srp.bo.custom.impl;

import lk.kingsland.srp.bo.custom.AddNewStudentBO;
import lk.kingsland.srp.dao.DAOFactory;
import lk.kingsland.srp.dao.custom.AddNewStudentDAO;
import lk.kingsland.srp.dao.custom.impl.AddNewStudentDAOImpl;
import lk.kingsland.srp.dto.studentDTO;
import lk.kingsland.srp.entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public class AddNewStudentBOImpl implements AddNewStudentBO {
    AddNewStudentDAO addNewStudentDAO = (AddNewStudentDAOImpl) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.AddNewStudentDAOImpl);

    public ArrayList<studentDTO> getAllStudent() throws Exception {
        ArrayList<studentDTO> allStudentID = new ArrayList<>();
        ArrayList<student> allStudentID1 = addNewStudentDAO.getAll();
        for (lk.kingsland.srp.entity.student student : allStudentID1) {
            allStudentID.add(new studentDTO(student.getStudentID(), student.getStudentName(), student.getAddress(), student.getContact(), student.getDob(), student.getGender()));
        }
        return allStudentID;
    }

    @Override
    public int getLastID() throws SQLException, ClassNotFoundException {
        int reg = addNewStudentDAO.getRogCount();

        return 0;
    }
}
