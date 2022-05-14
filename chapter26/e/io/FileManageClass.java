package chapter26.e.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        String pathName = "/Users/ohjeung/workspace/godofjava/test";
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    public void checkFile(String pathName, String fileName){
        File file = new File(pathName, fileName);
        try {
            System.out.println(file.createNewFile());
            getFileInfo(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) throws IOException{
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getCanonicalFile());

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println("Parent = " + file.getParent());
    }
}
