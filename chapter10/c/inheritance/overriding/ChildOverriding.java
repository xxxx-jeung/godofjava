package chapter10.c.inheritance.overriding;

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    public void printName(){
        System.out.println("ChildOverriding printName()");
    }
}
