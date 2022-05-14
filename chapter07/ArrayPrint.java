import java.lang.reflect.Array;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printString();
    }

    public void printString() {
        System.out.println("strings=" + new String[0]);
        System.out.println("arrayPrint=" + new ArrayPrint[0]);
    }

    public void printPrimitiveArray() {
        System.out.println("byte");
    }
}
