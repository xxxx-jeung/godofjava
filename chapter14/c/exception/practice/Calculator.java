package chapter14.c.exception.practice;

import java.util.Calendar;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.printDivide(1,2);
            calculator.printDivide(1,0);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void printDivide(double d1 ,double d2) throws Exception {
        double result = d1/d2;
        if(d2 <= 0){
            throw new Exception("Second value can't be Zero");
        } else {
            System.out.println("result = " + result);
        }
    }
}
