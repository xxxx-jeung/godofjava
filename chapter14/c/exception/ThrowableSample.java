package chapter14.c.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }
    
    public void throwable() {
        int[] intArray = new int[5];
        try{
            throw new Exception("에러가 발생했습니다.");
            //System.out.println("intArray[5] = " + intArray[5]);
        } catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
            t.getStackTrace().toString();
            try {
                throw new Exception("에러가 발생");
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
