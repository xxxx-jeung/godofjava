package chapter20.d.lang;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem system = new JavaLangSystem();
        system.systemPropertiesCheck();
    }

    public void systemPropertiesCheck(){
        System.out.println("java.version="+System.getProperty("java.version"));
        System.out.println("JAVA_HOME="+System.getenv());
    }
}
