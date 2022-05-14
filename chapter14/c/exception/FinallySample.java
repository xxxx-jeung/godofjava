package chapter14.c.exception;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample finallySample = new FinallySample();
        finallySample.finallySample();
    }

    public void finallySample(){
        int[] intArray = new int[5];
        try{
            System.out.println("intArray = " + intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
            System.err.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code must run.");

    }
}
