package lk.kingsland.srp.controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {

    public Label dateTime;
    public AnchorPane context;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeClock();
    }

    private void initializeClock() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            dateTime.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    public void btnAdNewStu(MouseEvent mouseEvent) {
    }

    public void btnReg(MouseEvent mouseEvent) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(this.getClass().getResource("../view/AddNewStudentForm.fxml")));
    }

    public void btnAddCourse(MouseEvent mouseEvent) {
    }

    public void btnCourseWiseStudent(MouseEvent mouseEvent) {
    }
}
