package dao.custom;

import dao.CrudDAO;
import entity.Prisoner;

public interface PrisonerDAO extends CrudDAO<Prisoner,String> {
    String getPrisonerLastId()throws Exception;
}
