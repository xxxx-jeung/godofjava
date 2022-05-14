package chapter24.d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample propertiesSample = new PropertiesSample();
        propertiesSample.saveAndLoadPropertiesXML();
        //propertiesSample.saveAndLoadProperties();
    }

    public void checkProperties(){
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject : keySet){
            System.out.println(tempObject+" = " + prop.get(tempObject));
        }
    }

    public void saveAndLoadProperties(){
        try(FileOutputStream fos = new FileOutputStream(new File("test.properties"));
            FileInputStream fis = new FileInputStream(new File("test.properties"))
        ) {
            Properties properties = new Properties();
            properties.setProperty("Writer", "Ohjeung");
            properties.setProperty("WriterHome", "http://www.GodOfJava.com");
            properties.store(fos, "Basic Properties file.");

            Properties propLoaded = new Properties();
            propLoaded.load(fis);
            System.out.println(propLoaded);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveAndLoadPropertiesXML(){
        try {
            String fileName = "text.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "Ohjeung");
            prop.setProperty("WriterHome", "http://www.GodOfJava.com");
            prop.storeToXML(fos, "Basic XML Properties file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            System.out.println("propLoaded = " + propLoaded);
            fis.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
