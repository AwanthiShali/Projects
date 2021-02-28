package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import connection.ClientConnection;
import connection.ConnectionUtil;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import readThread.ClientReadThread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientAppController extends Application {
    public JFXTextField txtMessage;
    public JFXButton btnSend;
    public ImageView imgCamera;

    static Socket socket = null;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    public JFXTextArea txtArea;
    public JFXTextField txtName;

    String username="";
    String message="";

    /*public void initialize(){
        new Thread(()->{
            try {
                socket=new Socket("localhost",5000);
                dataInputStream=new DataInputStream(socket.getInputStream());
                dataOutputStream=new DataOutputStream(socket.getOutputStream());

                String messageIn="";

                while (!messageIn.equals("end")){
                    messageIn=dataInputStream.readUTF();
                    txtArea.appendText("Server: "+messageIn.trim());
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }).start();
    }*/

    public void initialize(){
        new Thread(()->{
            try {
                socket=new Socket(ConnectionUtil.host,ConnectionUtil.port);
                txtArea.appendText("Connected"+"\n");

                dataOutputStream=new DataOutputStream(socket.getOutputStream());
                ClientReadThread task = new ClientReadThread(socket, this);
                Thread thread = new Thread(task);
                thread.start();
            } catch (IOException e) {
                txtArea.appendText(e.toString()+"\n");
            }
        }).start();
    }

    public void btnSendOnAction(ActionEvent actionEvent) throws IOException {
     try {
            username = txtName.getText().trim();
            message = txtMessage.getText().trim();

            if (username.length() == 0) {
                username = "Unknown";
            }
            if (message.length() == 0) {
                return;
            }
            dataOutputStream.writeUTF( username + " : " + message + "");
            dataOutputStream.flush();
            txtMessage.clear();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
            primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/ClientApp.fxml"))));
            primaryStage.setTitle("Client....");
            primaryStage.show();
    }
}
