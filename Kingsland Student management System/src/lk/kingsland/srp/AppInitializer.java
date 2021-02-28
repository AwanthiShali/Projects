package lk.kingsland.srp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("view/AddNewStudentForm.fxml"));
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("KingsLand");
//        primaryStage.setResizable(false);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/DashBoardForm.fxml"))));
        primaryStage.setTitle("KingsLand");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
