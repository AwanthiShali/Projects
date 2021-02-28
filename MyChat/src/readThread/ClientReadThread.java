package readThread;

import controller.ClientAppController;
import controller.ServerAppController;
import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReadThread implements Runnable {
    Socket socket;
    ClientAppController client;
    DataInputStream dataInputStream;
    String message = "";

    public ClientReadThread(Socket socket, ClientAppController client) {
        this.socket = socket;
        this.client = client;
    }
    @Override
    public void run() {
        while (true) {
            try {
                dataInputStream = new DataInputStream(socket.getInputStream());
                message = dataInputStream.readUTF();
                Platform.runLater(() -> {
                    client.txtArea.appendText(message + "\n");
                });
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
