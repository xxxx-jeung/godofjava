package chapter10.c.inheritance.polymorphism;

import chapter10.c.inheritance.Parent;

public class ChildOther extends Parent {
    public ChildOther() {
        System.out.println("ChildOther Constructor");
    }

    public void printName(){
        System.out.println("ChildOther - printName()");
    }
}
