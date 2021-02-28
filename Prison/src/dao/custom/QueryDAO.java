package dao.custom;

import dao.SuperDAO;
import dto.CustomDTO;
import entity.CustomEntity;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ObservableList<CustomEntity> getCourtDetailsFromPID(CustomDTO customDTO) throws ClassNotFoundException, SQLException;
}
