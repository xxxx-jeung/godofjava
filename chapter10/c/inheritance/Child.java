package chapter10.c.inheritance;

public class Child extends Parent{
    public Child() {
        System.out.println(super.toString());
        System.out.println("Child Constructor");
    }
}
