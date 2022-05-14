package chapter28.e.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    public void startServer() {
        Socket client = null;
        try (ServerSocket server = new ServerSocket(9999);) {
            while(true){
                client = server.accept();
                System.out.println("Server : Waiting for request.");

                System.out.println("Server : Accepted.");
                InputStream stream = client.getInputStream();

                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String data = null;

                StringBuilder receivedData = new StringBuilder();
                while((data=in.readLine()) != null){
                    receivedData.append(data);
                }

                System.out.println("Received datat: " + receivedData);
                in.close();
                stream.close();
                client.close();

                if("EXIT".equals(receivedData.toString())){
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
