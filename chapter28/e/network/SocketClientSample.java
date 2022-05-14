package chapter28.e.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    public void sendSocketSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendSocketData("I liked java at " + new Date());
        }
        sendSocketData("EXIT");
    }

    public void sendSocketData(String data) {
        try (Socket socket = new Socket("127.0.0.1", 9999);

        ) {

            System.out.println("Client:Connecting");
            System.out.println("Client:Connect status=" + socket.isConnected());

            Thread.sleep(1000);

            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);

            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
