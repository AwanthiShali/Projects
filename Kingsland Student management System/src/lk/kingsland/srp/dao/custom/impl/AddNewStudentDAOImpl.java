package lk.kingsland.srp.dao.custom.impl;

import lk.kingsland.srp.dao.CrudUtil;
import lk.kingsland.srp.dao.custom.AddNewStudentDAO;
import lk.kingsland.srp.entity.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddNewStudentDAOImpl implements AddNewStudentDAO {
    @Override
    public boolean add(student student) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(student student) throws Exception {
        return false;
    }

    @Override
    public student search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<student> getAll() throws Exception {
        String sql = "SELECT * from student";
        ArrayList<student> students = new ArrayList<>();
        ResultSet resultSet = CrudUtil.executeQuery(sql);
        while (resultSet.next()){
            students.add(new student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
        }
        return students;
    }


    @Override
    public int getRogCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(studentID) FROM student";
        ResultSet resultSet = CrudUtil.executeQuery(sql);
        if (resultSet.next()){
            return resultSet.getInt(1);
        }
        return -1;
    }
}
