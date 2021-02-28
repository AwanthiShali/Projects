package readThread;

import controller.ClientAppController;
import controller.ServerAppController;
import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReadThread implements Runnable{
    Socket socket;
    ServerAppController server;
    DataInputStream dataInputStream;
    String message = "";

    public ServerReadThread(Socket socket, ServerAppController server) {
        this.socket = socket;
        this.server = server;
    }
    @Override
    public void run() {
        while (true) {
            try {
                dataInputStream = new DataInputStream(socket.getInputStream());
                message = dataInputStream.readUTF();
                Platform.runLater(() -> {
                    server.txtArea.appendText(message + "\n");
                });
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
