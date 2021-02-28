package bo.custom;

import bo.SuperBO;
import dto.CourtDetailsDTO;

import java.sql.SQLException;

public interface CourtDetailsBO extends SuperBO {
    boolean addCourtDetails(CourtDetailsDTO customer) throws ClassNotFoundException, SQLException, Exception;
    String getLastID() throws ClassNotFoundException, SQLException, Exception;
}
