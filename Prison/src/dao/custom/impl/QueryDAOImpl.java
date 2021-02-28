package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.QueryDAO;
import dto.CustomDTO;
import entity.CustomEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public ObservableList<CustomEntity> getCourtDetailsFromPID(CustomDTO customDTO) throws ClassNotFoundException, SQLException {
        String pid=customDTO.getPid();
        String sql = " select "
                + "Prisoner.pid,"
                + "Prisoner.name,"
                + "Court_Details.CoID,"
                + "Court_Details.nextCo_day,"
                + "Court_Details.Co_time"
                + " from Prisoner inner join Court_Details"
                + " on Prisoner.pid=Court_Details.pid"
                + " where Prisoner.pid=?";
        ResultSet rst = CrudUtil.executeQuery(sql, pid);
        ObservableList<CustomEntity> allDetails = FXCollections.observableArrayList();
        while (rst.next()) {
            String prisonerID = rst.getString(1);
            String name = rst.getString(2);
            String CoID = rst.getString(3);
            String nextCo_day = rst.getString(4);
            String  Co_time= rst.getString(5);

            CustomEntity t = new CustomEntity(prisonerID,name,CoID,nextCo_day,Co_time);
            allDetails.add(t);
        }
        return allDetails;
    }
}
