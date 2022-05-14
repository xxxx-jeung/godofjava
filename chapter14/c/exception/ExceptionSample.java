package chapter14.c.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample exceptionSample = new ExceptionSample();
        exceptionSample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds(){
        int[] intArray = new int[5];
        System.out.println("intArray = " + intArray[5]);
    }

    public void arrayOutOfBoundsTryCatch(){
        int[] intArray = new int[5];
        try {
            throw new Exception("에러가 발생했습니다.");
            //System.out.println("intArray = " + intArray[5]);
            //System.out.println("This code should run");
        } catch (Exception e){
            e.printStackTrace();
            System.err.println("Exception occurred.");
        }
        System.out.println("This code must run.");
    }
}
