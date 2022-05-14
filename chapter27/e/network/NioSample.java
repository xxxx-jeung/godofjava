package chapter27.e.network;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    public void basicWriteAndRead(){
        String fileName = "/Users/ohjeung/workspace/godofjava/test/nio.txt";
        try {
            writeFile(fileName, "My first NIO sample");
            readFile(fileName);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName, String data){
        try(FileChannel fileChannel = new FileOutputStream(fileName).getChannel();){
            byte[] byteData = data.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(byteData);
            fileChannel.write(buffer);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(String fileName) {
        try(FileChannel fileChannel = new FileInputStream(fileName).getChannel();){
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fileChannel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.print((char)buffer.get());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
