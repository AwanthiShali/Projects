package lk.kingsland.srp.bo.custom;

import lk.kingsland.srp.bo.SuperBO;
import lk.kingsland.srp.dto.studentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AddNewStudentBO extends SuperBO {
    ArrayList<studentDTO> getAllStudent() throws Exception;

    int getLastID() throws SQLException, ClassNotFoundException;
}
