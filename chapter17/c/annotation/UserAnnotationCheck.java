package chapter17.c.annotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck annotationCheck = new UserAnnotationCheck();
        annotationCheck.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass){
        Method[] methods = useClass.getDeclaredMethods();
        for(Method tempMethod : methods){
            //System.out.println(tempMethod.getName());
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
            if(annotation != null){
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tempMethod.getName() + "() : number = " + number + " text = " + text);
            } else {
                System.out.println(tempMethod.getName() + "() : annotation is null.");
            }
        }
    }
}
