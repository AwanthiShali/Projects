package dao.custom;

import dao.CrudDAO;
import entity.Crime;

import java.util.ArrayList;

public interface CrimeDAO extends CrudDAO<Crime,String> {
    ArrayList getAllCrimes()throws Exception;
}
