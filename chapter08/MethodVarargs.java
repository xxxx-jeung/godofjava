public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs methodVarargs = new MethodVarargs();
        methodVarargs.calculateNumbersWithArray(new int[] { 1, 2, 3, 4, 5 });
        methodVarargs.calculateNumbers(1, 2, 3, 4, 5);

    }

    public void calculateNumbersWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int val : numbers) {
            total += val;
            System.out.println(val);
        }
        System.out.println(total);
    }
}
