package lk.kingsland.srp.bo.custom.impl;

import lk.kingsland.srp.bo.custom.AddNewCourseBO;
import lk.kingsland.srp.dao.DAOFactory;
import lk.kingsland.srp.dao.custom.AddNewCourseDAO;
import lk.kingsland.srp.dto.courseDTO;
import lk.kingsland.srp.entity.course;

import java.util.ArrayList;

public class AddNewCourseBOimpl implements AddNewCourseBO {
    AddNewCourseDAO addNewCourseDAO = (AddNewCourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.AddNewCourseDAOimpl);

    @Override
    public ArrayList<courseDTO> getAllCourse() throws Exception {
        ArrayList<course> all = addNewCourseDAO.getAll();
        ArrayList<courseDTO> allCourse = new ArrayList<>();
        for (course courses : all) {
            allCourse.add(new courseDTO(courses.getCodeID(), courses.getCourseName(), courses.getDuration(), courses.getRegistrationFee(), courses.getIntake()));
        }
        return allCourse;
    }
}
