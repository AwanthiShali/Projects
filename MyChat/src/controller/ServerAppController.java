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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import readThread.ClientReadThread;
import readThread.ServerReadThread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAppController extends Application {
    public Label lblName;
    public ImageView imgCamera;
    public JFXTextField txtMessage;
    public JFXButton btnSend;

    static ServerSocket serverSocket;
    static Socket socket;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    public JFXTextArea txtArea;

    List<ClientConnection> clientConnections=new ArrayList<ClientConnection>();

    public static void main(String[] args) {
        launch(args);
    }

    public void initialize(){
        new Thread(()->{
            try {

                serverSocket=new ServerSocket(ConnectionUtil.port);

                while (true){
                    socket=serverSocket.accept();
                    if(socket!=null) {
                        ClientConnection connection = new ClientConnection(socket, this);
                        clientConnections.add(connection);
                        Thread thread = new Thread(connection);
                        thread.start();
                        dataOutputStream=new DataOutputStream(socket.getOutputStream());
                        ServerReadThread task = new ServerReadThread(socket,this);
                        Thread thread2 = new Thread(task);
                        thread.start();
                    }
                }
            } catch (IOException e) {
                txtArea.appendText(e.toString()+"\n");
            }
        }).start();

    }

    public void btnSendOnAction(ActionEvent actionEvent) throws IOException {
        try {
            String message = txtMessage.getText().trim();

            if (message.length() == 0) {
                return;
            }
            dataOutputStream.writeUTF(   "Server : " + message + "");
            dataOutputStream.flush();
            txtMessage.clear();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*String messageIn="";
    public void initialize(){
        new Thread(()->{
            try {
                serverSocket=new ServerSocket(5000);
                socket=serverSocket.accept();
                dataInputStream=new DataInputStream(socket.getInputStream());
                dataOutputStream=new DataOutputStream(socket.getOutputStream());

                while (!messageIn.equals("end")){
                    messageIn=dataInputStream.readUTF();
                    txtArea.appendText("\n Client: "+messageIn.trim());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/ServerApp.fxml"))));
        primaryStage.setTitle("Server");
        primaryStage.show();

    }

    public void broadcast(String message) {
        for (ClientConnection clientConnection:this.clientConnections) {
            clientConnection.sendMessage(message);
        }

    }

}
