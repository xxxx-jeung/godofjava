package chapter27.e.io.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manage = new ManageObject();
        String fullPath = "/Users/ohjeung/workspace/godofjava/test/serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
//        manage.saveObject(fullPath, dto);
        manage.loadObject(fullPath);
    }

    public void saveObject(String fullPath, SerialDTO dto) {
        try (FileOutputStream fos = new FileOutputStream(fullPath); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(dto);
            System.out.println("Write Success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadObject(String fullPath){
        try(FileInputStream fis = new FileInputStream(fullPath); ObjectInputStream ois = new ObjectInputStream(fis)){
            Object obj = ois.readObject();
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
