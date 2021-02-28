package controller;

import bo.BOFactory;
import bo.custom.PrisonerBO;
import bo.custom.impl.PrisonerBOImpl;
import com.jfoenix.controls.JFXDatePicker;
import dto.CourtDetailsDTO;
import dto.CustomDTO;
import dto.PrisonerDTO;
import dto.SectionDTO;
import entity.Court_Details;
import entity.Prisoner;
import entity.Section;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Window;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class PrisonerFormController implements Initializable {
    public ComboBox cmbSection;
    public TextField txtPID;
    public TextField txtSurname;
    public TextField txtName;
    public TextField txtDOB;
    public TextField txtRelative;
    public TextField txtSectionID;
    public TextField txtAge;
    public TextField txtRelationship;
    public Button btnAdd;
    public Button btnToUpdate;
    public Button btnBack;
    public AnchorPane context;
    public Label lblCdID;
    public ComboBox cmbCrime;
    public Label lblCrimeID;
    public TextField txtPunishment;
    public TextField txtPunishedDate;
    public TextField txtCourtTime;
    //public JFXDatePicker nextCourtDay;
    public TableView<CustomDTO> tblPrisoner;
    public TableColumn<Object,Object> colPid;
    public TableColumn<Object,Object> colName;
    public TableColumn<Object,Object> colCoID;
    public TableColumn<Object,Object> colNextCourtDay;
    public TableColumn<Object,Object> colNextCourtTime;
    public TextField nextCourtDate;
    public Button btnDelete;

    PrisonerBO pBO= (PrisonerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PRISONER);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getLastPrisonerID();
        loadSections();
        loadCrimes();
        setCoDetailID();
        colPid.setCellValueFactory(new PropertyValueFactory<>("pid"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCoID.setCellValueFactory(new PropertyValueFactory<>("coDetailID"));
        colNextCourtDay.setCellValueFactory(new PropertyValueFactory<>("nextCourtDate"));
        colNextCourtTime.setCellValueFactory(new PropertyValueFactory<>("nextCourtTime"));
        loadTableCourtDetails();
    }

    private void loadTableCourtDetails() {
        try {
            CustomDTO customDTO=new CustomDTO(txtPID.getText(),txtName.getText(),lblCdID.getText(),nextCourtDate.getText(),txtCourtTime.getText());
            ObservableList<CustomDTO> allDetails=pBO.getAllCustoms(customDTO);
            tblPrisoner.setItems(allDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setCoDetailID() {
        try {
            String coID=pBO.getCourtDetailsID();
            if(coID!=null) {
                int id=Integer.parseInt(coID)+1;
                lblCdID.setText(String.valueOf(id));
            }else {
                lblCdID.setText("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadCrimes() {
        try {
            ArrayList<String> allCrimes=pBO.getAllCrimes();
            cmbCrime.setItems(FXCollections.observableArrayList(allCrimes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        String pid =txtPID.getText();
        String sid =txtSectionID.getText();
        String surname=txtSurname.getText();
        String name=txtName.getText();
        String dob=txtDOB.getText();
        String age=txtAge.getText();
        String relative=txtRelative.getText();
        String relationship=txtRelationship.getText();

        ArrayList<CourtDetailsDTO> court_details=new ArrayList<>();
        CourtDetailsDTO coDetails=new CourtDetailsDTO(lblCdID.getText(),lblCrimeID.getText(),txtPID.getText(),txtPunishment.getText(),txtPunishedDate.getText(),nextCourtDate.getText(),txtCourtTime.getText());
        court_details.add(coDetails);
        PrisonerDTO prisonerDTO=new PrisonerDTO(pid,sid,surname,name,dob,Integer.parseInt(age),relative,relationship,court_details);
        try {
            boolean isAdded=pBO.addPrisoner(prisonerDTO);
            if(isAdded){
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information....!");
                alert.setContentText("Added Successfully..!!");
                alert.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnToUpdateOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PrisonerUpdateForm");
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DefaultForm");
    }
    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(this.getClass().
                getResource("/view/" + location + ".fxml")));
    }
    private void getLastPrisonerID(){
        try {
            String id=pBO.getLastID();
            if(id!=null){
                int pid= Integer.parseInt(id)+1;
                txtPID.setText(String.valueOf(pid));
            } else {
                txtPID.setText("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void loadSections() {
        try {
            ArrayList<String> allSection=pBO.getAllSection();
            cmbSection.setItems(FXCollections.observableArrayList(allSection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cmbSectionOnAction(ActionEvent actionEvent) {
        String section= (String) cmbSection.getSelectionModel().getSelectedItem();
        try {
            String sectionID= pBO.getSectionID(section);
            txtSectionID.setText(sectionID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cmbCrimeOnAction(ActionEvent actionEvent) {
        String crime= (String) cmbCrime.getSelectionModel().getSelectedItem();
        try {
            String crimeID= pBO.getCrimeID(crime);
            lblCrimeID.setText(crimeID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void txtDOBOnAction(ActionEvent actionEvent) {
        String dob=txtDOB.getText();
       /* LocalDate today=LocalDate.now();
        LocalDate birth=new LocalDate(dob);*/

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String pid=txtPID.getText();
        try {
            boolean isDeleted= pBO.deletePrisoner(pid);
            if(isDeleted){
                JOptionPane.showInputDialog("Deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
