package chapter10.c.inheritance;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate Constructor");
    }

    private void printName(){
        System.out.println("ParentOverridingPrivate - printName()");
    }
}
