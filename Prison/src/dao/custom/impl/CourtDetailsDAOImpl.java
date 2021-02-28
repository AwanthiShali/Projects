package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CourtDetailsDAO;
import entity.Court_Details;
import entity.Prisoner;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CourtDetailsDAOImpl implements CourtDetailsDAO {
    @Override
    public String getCourtDetailsLastId() throws Exception {
        String sql = "select max(CoID) from Court_Details";
        ResultSet rst = CrudUtil.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    @Override
    public boolean add(Court_Details court) throws Exception {
        String sql = "insert into Court_Details values(?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,court.getCoID(),court.getCid(),court.getPid(),court.getPunishment(),court.getPunished_day(),court.getNextCo_day(),court.getCo_time());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Court_Details court_details) throws Exception {
        return false;
    }

    @Override
    public Court_Details search(String s) throws Exception {
        String sql = "select * from Court_Details where CoID=?";
        ResultSet rst = CrudUtil.executeQuery(sql, s);
        if (rst.next()) {
            return new Court_Details(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
        }
        return null;
    }

    @Override
    public ArrayList<Court_Details> getAll() throws Exception {
        String sql = "select * from Court_Details";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Court_Details> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new Court_Details(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getString(7),rst.getString(8)));
        }
        return all;
    }
}
