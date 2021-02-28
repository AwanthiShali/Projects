package dao.custom;

import dao.CrudDAO;
import entity.Court_Details;

public interface CourtDetailsDAO extends CrudDAO<Court_Details,String> {
    String getCourtDetailsLastId()throws Exception;
}
