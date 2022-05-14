package chapter10.c.inheritance.casting;

import java.util.Arrays;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        /*inheritance.objectCast();
        inheritance.objectCast2();*/
        inheritance.objectCastArray();
    }

    public void objectTypeCheck(ParentCasting[] parentArray) {
        for(ParentCasting parentCasting : parentArray){
            if(parentCasting instanceof ChildCasting){
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) parentCasting;
                tempChild.printAge();
            } else if(parentCasting instanceof ParentCasting){
                System.out.println("ParentCasting");
            }
        }
    }
    public void objectCastArray(){
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    public void objectCast(){
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;

        parent2.printName();
        ((ChildCasting) parent2).printAge();

        //ChildCasting childTest = (ChildCasting) parent;
        ChildCasting child2 = (ChildCasting) parent2;

        child2.printName();
        child2.printAge();

        System.out.println("--------------------------------------------------------");
        parent.printName();
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;

        ChildCasting child2 = (ChildCasting) parent2;

    }
}
