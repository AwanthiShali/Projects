package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AddTreatmentFormController {
    public Label lblTreatmentID;
    public TextField txtTreatment;
    public TextField txtDoctor;
    public TextField txtHospital;
    public Button btnAdd;
    public Button btnBack;
    public AnchorPane context;

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PrisonerUpdateForm");
    }
    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(this.getClass().
                getResource("/view/" + location + ".fxml")));
    }
}
