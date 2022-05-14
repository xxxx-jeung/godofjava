package chapter15.c.string;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert(){
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes();
            for (byte data : array1){
                System.out.println("data = " + data);
            }
            System.out.println();
            String korean2 = new String(array1);
            System.out.println("korean2 = " + korean2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
