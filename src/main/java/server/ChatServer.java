package server;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(20000);
//            serverSocket.setReuseAddress(true); //设置 ServerSocket 的选项
            System.out.println("Server is running....");

            Socket clientSocket;
            ServerThread worker;

            for (;;) {
                clientSocket = serverSocket.accept();
                worker = new ServerThread(clientSocket);
                worker.start();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
