package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CrimeDAO;
import entity.Crime;
import entity.Section;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CrimeDAOImpl implements CrimeDAO {
    @Override
    public ArrayList getAllCrimes() throws Exception {
        String sql="Select category FROM Crime";
        ArrayList<String> all=new ArrayList<>();
        ResultSet rst= CrudUtil.executeQuery(sql);
        while (rst.next()){
            all.add(rst.getString(1));
        }
        return all;
    }

    @Override
    public boolean add(Crime crime) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Crime crime) throws Exception {
        return false;
    }

    @Override
    public Crime search(String s) throws Exception {
        String sql = "select * from Crime where category=?";
        ResultSet rst = CrudUtil.executeQuery(sql, s);
        if (rst.next()) {
            return new Crime(rst.getString(1), rst.getString(2));
        }
        return null;
    }

    @Override
    public ArrayList<Crime> getAll() throws Exception {
        return null;
    }
}
