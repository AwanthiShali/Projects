package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.SectionDAO;
import entity.Prisoner;
import entity.Section;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SectionDAOImpl implements SectionDAO {

    @Override
    public boolean add(Section section) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Section section) throws Exception {
        return false;
    }

    @Override
    public Section search(String s) throws Exception {
        String sql = "select * from Section where section_name=?";
        ResultSet rst = CrudUtil.executeQuery(sql, s);
        if (rst.next()) {
            return new Section(rst.getString(1), rst.getString(2));
        }
        return null;
    }

    @Override
    public ArrayList<Section> getAll() throws Exception {
        return null;
    }

    @Override
    public ArrayList<String> getSectionName() throws Exception {
        String sql="Select section_name FROM Section";
        ArrayList<String> all=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery(sql);
        while (rst.next()){
            all.add(rst.getString(1));
        }
        return all;
    }
}
