package chapter26.e.io;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        // /Users/ohjeung/workspace/godofjava
        String pathName = "/Users/ohjeung/workspace/godofjava/test";
        sample.lastModified(pathName);
    }

    public void checkPath(String pathName){
        File file = new File(pathName);
        System.out.println(pathName);
        System.out.println("file = " + file.exists());
    }

    public void makeDir(String pathName){
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result = " + file.mkdir());

    }

    public void checkFileMethods(String pathName){
        File file = new File(pathName);
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isHidden() = " + file.isHidden());
    }

    public void canFileMethods(String pathName){
        File file = new File(pathName);
        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.canWrite() = " + file.canWrite());
        System.out.println("file.canExecute() = " + file.canExecute());
    }

    public void lastModified(String pathName){
        File file = new File(pathName);
        System.out.println("file = " + file.lastModified());
        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));
    }
}
