package client;


import java.io.*;
import java.net.Socket;


public class ClientThread extends Thread {

    private Socket clientSocket;
    public ClientThread(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            OutputStream os = clientSocket.getOutputStream();
            InputStream is = clientSocket.getInputStream();



            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
