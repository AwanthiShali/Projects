package lk.kingsland.srp.dao.custom;

import lk.kingsland.srp.dao.CrudDAO;
import lk.kingsland.srp.entity.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface AddNewStudentDAO extends CrudDAO<student, String> {
    int getRogCount() throws SQLException, ClassNotFoundException;
//    ArrayList<student> getAllStudentID() throws Exception;
}
