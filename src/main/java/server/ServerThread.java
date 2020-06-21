package server;

import java.net.Socket;

public class ServerThread extends Thread{
    private Socket clientSocket;

    // TODO Auto-generated constructor stub

    public ServerThread(Socket clientSocket) {
        super();
        this.clientSocket = clientSocket;
    }

    public void run(){

    }
}
