package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.PrisonerDAO;
import entity.Prisoner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.util.ArrayList;

public class PrisonerDAOImpl implements PrisonerDAO {
    @Override
    public String getPrisonerLastId() throws Exception {
        String sql = "select max(pid) from Prisoner";
        ResultSet rst = CrudUtil.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    @Override
    public boolean add(Prisoner prisoner) throws Exception {
        String sql = "insert into Prisoner values(?,?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,prisoner.getPid(),prisoner.getSid(),prisoner.getSurname(),prisoner.getName(),prisoner.getDob(),prisoner.getAge(),prisoner.getRelative_name(),prisoner.getRelationship());
    }

    @Override
    public boolean delete(String s) throws Exception {
        String sql="Delete From Prisoner where pid=?";
        return CrudUtil.executeUpdate(sql,s);
    }

    @Override
    public boolean update(Prisoner prisoner) throws Exception {
        return false;
    }

    @Override
    public Prisoner search(String s) throws Exception {
        String sql = "select * from Prisoner where pid=?";
        ResultSet rst = CrudUtil.executeQuery(sql, s);
        if (rst.next()) {
            return new Prisoner(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getInt(6),rst.getString(7),rst.getString(8));
        }
        return null;
    }

    @Override
    public ArrayList<Prisoner> getAll() throws Exception {
        String sql = "select * from Prisoner";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Prisoner> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new Prisoner(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getInt(6),rst.getString(7),rst.getString(8)));
        }
        return all;
    }
}
