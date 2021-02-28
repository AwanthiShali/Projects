package connection;

import controller.ServerAppController;
import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientConnection implements Runnable{
    Socket socket;
    ServerAppController server;

    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;

    public ClientConnection(Socket socket,ServerAppController server){
        this.socket=socket;
        this.server=server;
    }

    @Override
    public void run() {
        try{
            dataInputStream= new DataInputStream(socket.getInputStream());
            dataOutputStream=new DataOutputStream(socket.getOutputStream());

            while (true){
                String message = dataInputStream.readUTF();
                server.broadcast(message);
                Platform.runLater(()->{
                    server.txtArea.appendText(message + "\n");
                });
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message){
        try{
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
