package chapter13.c.enums;

public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2[] valueList = OverTimeValues2.values();
        for(OverTimeValues2 values : valueList){
            System.out.println("values = " + values);
        }
    }
}
