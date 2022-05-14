package chapter26.e.io;

import java.io.File;
import java.io.FileFilter;

public class JPEGFileFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        if(file.isFile()){
            String fileName = file.getName();
            if(fileName.endsWith(".jpeg")) return true;
        }
        return false;
    }
}
