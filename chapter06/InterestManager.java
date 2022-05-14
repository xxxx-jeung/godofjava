public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        for (int day = 1; day < 366; day += 1) {
            System.out.println(interestManager.calculateAmount(day, 1000000));
        }

    }

    public double getInterestRate(int day) {
        double value = 0;

        if (day < 90)
            value = 0.5;
        else if (day < 180)
            value = 1;
        else if (day < 364)
            value = 2;
        else
            value = 5.6;

        return value;
    }

    public double calculateAmount(int day, long amount) {
        return amount * getInterestRate(day) / 100;
    }

}
