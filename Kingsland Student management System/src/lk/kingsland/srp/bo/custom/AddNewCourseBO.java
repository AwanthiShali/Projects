package lk.kingsland.srp.bo.custom;

import lk.kingsland.srp.bo.SuperBO;
import lk.kingsland.srp.dto.courseDTO;

import java.util.ArrayList;

public interface AddNewCourseBO extends SuperBO {
    ArrayList<courseDTO> getAllCourse() throws Exception;
}
