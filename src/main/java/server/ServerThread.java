package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket clientSocket;
    private Handler handler;

    // TODO Auto-generated constructor stub

    public ServerThread(Socket clientSocket) {
        super();
        this.clientSocket = clientSocket;
    }

    public void run(){
        try{
            ObjectOutputStream oos;
            ObjectInputStream ois;
            ois = new ObjectInputStream(clientSocket.getInputStream());

            oos = new ObjectOutputStream(clientSocket.getOutputStream());

            Object sendobject = (Object) ois.readObject();
            System.out.println(sendobject);

            Object reciveobject=null;


            reciveobject= handler.handle(sendobject);
            oos.writeObject(reciveobject);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
