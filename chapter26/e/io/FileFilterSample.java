package chapter26.e.io;

import java.io.File;
import java.io.Serializable;

public class FileFilterSample implements Serializable {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = "/Users/ohjeung/Documents/사업계획/tour_image";
        sample.checkList(pathName);
    }

    public void checkList(String pathName){
        File file;
        try {
            file = new File(pathName);
//            File[] mainFileList = file.listFiles();
            File[] mainFileList = file.listFiles(new JPEGFileFilter());

            for(File tempFile : mainFileList){
                System.out.println(tempFile.getName());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
