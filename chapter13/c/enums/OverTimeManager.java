package chapter13.c.enums;

public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager overTimeManager = new OverTimeManager();
        int myAmount = overTimeManager.getOverTimeAmout(OverTimeValues.THREE_HOUR);
        System.out.println("myAmount = " + myAmount);

    }

    public int getOverTimeAmout(OverTimeValues value){
        int amout = 0;
        System.out.println("amout = " + amout);
        switch (value){
            case THREE_HOUR:
                amout=18000;
                break;
            case FIVE_HOUR:
                amout=30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amout=40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amout=60000;
                break;
        }
        return amout;
    }
}
