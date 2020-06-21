package client;


import java.io.*;
import java.net.Socket;


public class ClientThread {


    public static Object run(Object sendobject) {
        Object reciveobject = null;
        try {
            // 1.connect to the server
            Socket serverSocket = new Socket("localhost", 30000);

            // 2.get oos,ois
            OutputStream os = serverSocket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);

            InputStream is = serverSocket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);

            // 3.send
            oos.writeObject(sendobject);


            // 4.receive

            reciveobject = (Object) ois.readObject();

            ois.close();
            oos.close();
            serverSocket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return reciveobject;
    }

}
