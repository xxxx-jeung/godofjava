package chapter09.ga.didden.c.javapackage;

import chapter09.ga.didden.c.javapackage.sub.SubStatic;

import static chapter09.ga.didden.c.javapackage.sub.SubStatic.CLASS_NAME;
import static chapter09.ga.didden.c.javapackage.sub.SubStatic.subStaticMethod;

public class PackageStatic {
    public static void main(String[] args) {
//        SubStatic.subStaticMethod();
//        System.out.println(SubStatic.CLASS_NAME);
        subStaticMethod();
        System.out.println(CLASS_NAME);

    }
}
