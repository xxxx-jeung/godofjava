package chapter12.c.inheritance;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();

        System.out.println("===============================");

        thisObject.equalMethod2();
    }

    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }

        System.out.println("obj1 = " + obj1);
        System.out.println("-----------------------------");
        System.out.println("obj2 = " + obj2);
    }

    public void equalMethod2(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }

        System.out.println("obj1 = " + obj1);
        System.out.println("-----------------------------");
        System.out.println("obj2 = " + obj2);
    }

}
