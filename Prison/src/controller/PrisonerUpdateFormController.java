package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PrisonerUpdateFormController {
    public Label lblCdID;
    public ComboBox cmbPID;
    public ComboBox cmbCrime;
    public Label lblCrimeID;
    public TextField txtPunishment;
    public TextField txtPunishedDate;
    public TextField txtNextDay;
    public TextField txtCourtTime;
    public Label lblTrDetailsID;
    public ComboBox cmbTreatment;
    public Button btnAdd;
    public TextField txtDate;
    public TextField txtProgress;
    public Button btnUpdate;
    public Button btnBack;
    public AnchorPane context;
    public JFXDatePicker nextCourtDay;
    public JFXDatePicker dateDate;
    public JFXButton btnReleased;
    public JFXComboBox cmbDoctor;
    public JFXComboBox cmbHospital;
    public JFXButton btnTreateDoc;

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PrisonerForm");
    }
    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(this.getClass().
                getResource("/view/" + location + ".fxml")));
    }

    public void btnReleasedOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ReleasedForm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void btnTreateOnAction(ActionEvent actionEvent) throws IOException {
        /*setUi("AddTreatmentForm");*/
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/AddTreatmentForm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
