package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public Button btnPrisoners;
    public Button btnVisitors;
    public Button btnGuard;
    public Button btnReports;
    public Button btnLogout;
    public AnchorPane anchorPaneMain;
    public void initialize() throws IOException {
        loadDefault();//Alt + Enter
    }

    private void loadDefault() throws IOException {
        setUi("DefaultForm");
    }

    private void setUi(String location) throws IOException {
        anchorPaneMain.getChildren().clear();
        anchorPaneMain.getChildren().add(FXMLLoader.load(this.getClass().
                getResource("/view/" + location + ".fxml")));
    }

    public void btnPrisonersOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PrisonerForm");
    }

    public void btnVisitorsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("VisitorForm");
    }

    public void btnGuardOnAction(ActionEvent actionEvent) throws IOException {
        setUi("GuardForm");
    }

    public void btnReportsOnAction(ActionEvent actionEvent) {
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/LoginForm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();

    }
}
