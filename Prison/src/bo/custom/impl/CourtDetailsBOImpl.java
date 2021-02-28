package bo.custom.impl;

import bo.custom.CourtDetailsBO;
import dto.CourtDetailsDTO;

import java.sql.SQLException;

public class CourtDetailsBOImpl implements CourtDetailsBO {
    @Override
    public boolean addCourtDetails(CourtDetailsDTO customer) throws ClassNotFoundException, SQLException, Exception {
        return false;
    }

    @Override
    public String getLastID() throws ClassNotFoundException, SQLException, Exception {
        return null;
    }
}
