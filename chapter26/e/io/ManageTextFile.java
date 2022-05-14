package chapter26.e.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.io.File.separator;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manage = new ManageTextFile();
        int numberCnt = 10;
        String fullPath = "/Users/ohjeung/workspace/godofjava/test/numbers.txt";
        //manage.writeFile(fullPath, numberCnt);
        //manage.readFile(fullPath);
        manage.readFiles(fullPath);
    }

    public void writeFile(String fileName, int numberCount) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int loop = 0; loop <= numberCount; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }

            System.out.println("Write success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close!!");
        }
    }

    public void readFile(String fileName){
        try(FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String data;
            while((data=bufferedReader.readLine()) != null ){
                System.out.println(data);
            }
            System.out.println("Read success !!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFiles(String fileName){
        try {
            String data = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(data);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
