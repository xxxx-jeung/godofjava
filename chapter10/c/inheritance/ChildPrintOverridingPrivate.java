package chapter10.c.inheritance;

public class ChildPrintOverridingPrivate extends ParentOverridingPrivate{
    public ChildPrintOverridingPrivate() {
        System.out.println("ChildPrintOverridingPrivate Constructor");
    }

    public void printName(){
        System.out.println("ChildPrintOverridingPrivate printAge()");
    }
}
