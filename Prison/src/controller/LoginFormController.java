package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUser;
    public PasswordField txtPassword;
    public Button btnLogin;
    public AnchorPane root;

    public void btnLoginOnKeyPressed(KeyEvent keyEvent) throws IOException {
        String userName=txtUser.getText().trim();
        String password=txtPassword.getText().trim();

        if (userName.length()>0 && password.length()>0){
            if (userName.equalsIgnoreCase("admin")
                    && password.equals("1234")){
                btnLogin.setDefaultButton(true);
                Stage window = (Stage) this.root.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(this.getClass()
                        .getResource("/view/DashBoardForm.fxml"))));
                window.centerOnScreen();

            }else{
                new Alert(Alert.AlertType.WARNING, "Try Again!",
                        ButtonType.OK).show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING, "User Name Or Password Empty!",
                    ButtonType.OK).show();
        }
    }
}
