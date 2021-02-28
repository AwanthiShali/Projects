package dao.custom;

import dao.CrudDAO;
import entity.Prisoner;
import entity.Section;

import java.util.ArrayList;

public interface SectionDAO extends CrudDAO<Section,String> {
    ArrayList getSectionName()throws Exception;
}
