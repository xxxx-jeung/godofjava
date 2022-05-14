public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength arrayLength = new ArrayLength();
        arrayLength.printArrayLength();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim[0].length);
    }
}