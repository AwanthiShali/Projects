package lk.kingsland.srp.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.sun.org.apache.xpath.internal.operations.String;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import lk.kingsland.srp.bo.BOFactory;
import lk.kingsland.srp.bo.custom.AddNewCourseBO;
import lk.kingsland.srp.bo.custom.AddNewStudentBO;
import lk.kingsland.srp.dto.courseDTO;
import lk.kingsland.srp.dto.studentDTO;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddNewStudentFormController implements Initializable {
    public JFXComboBox cblStudentID;
    public JFXTextField txtFullName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXTextField txtDOB;
    public JFXComboBox cblGender;
    public JFXTextField txtDate;
    public JFXComboBox cblSelectCourse;
    public JFXButton btnRegister;
    public JFXTextField txtRegFee;
    ObservableList<String> studentObservableList = FXCollections.observableArrayList();
    AddNewStudentBO addNewStudentBOImpl = (AddNewStudentBO) BOFactory.getInstance().getBO(BOFactory.BOType.AddNewStudentBOImpl);
    AddNewCourseBO addNewCourseBO = (AddNewCourseBO) BOFactory.getInstance().getBO(BOFactory.BOType.AddNewCourseBOimpl);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadAllStudent();
        loadAllCourse();
    }

    private void loadAllCourse() {
        try {
            ArrayList<courseDTO> allCourse = addNewCourseBO.getAllCourse();
            ObservableList<String> allCourseNames = FXCollections.observableArrayList();
            for (int i = 0; i < allCourse.size(); i++) {
                allCourseNames.add(allCourse.get(i).getCourseName());
            }
            cblSelectCourse.setItems(allCourseNames);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadAllStudent() {
        try {
            ArrayList<studentDTO> allStudentID = addNewStudentBOImpl.getAllStudent();
            for (int i = 0; i < allStudentID.size(); i++) {
                ObservableList<java.lang.String> studentObservableList = FXCollections.observableArrayList();
                studentObservableList.addAll(allStudentID.get(i).getStudentID());
            }
            cblStudentID.setItems(studentObservableList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnNewStudent(ActionEvent actionEvent) {
        cblStudentID.getItems().clear();

        ObservableList<String> studentList = FXCollections.observableArrayList();
        studentList.add(getNewStudentID());
        cblStudentID.getItems().add(studentList);
    }

    private String getNewStudentID() {
         int studentDTO = addNewStudentBOImpl.getLastID();
         return null;
    }

    public void btnRegister(ActionEvent actionEvent) {

    }

    public void cblSelectGender(ActionEvent actionEvent) {
        System.out.println("on action");
    }

    public void cblGetStudentID(ActionEvent actionEvent) {

    }


    public void cmbSelectGender(ActionEvent actionEvent) {

    }
}
