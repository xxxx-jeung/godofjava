package chapter25.e.thread.sync;

public class CommonCalculate {
    private int amount;
    private int interest;

    Object lock = new Object();
    Object amountLock = new Object();

    public CommonCalculate() {
        this.amount = 0;
    }

    public void plus(int value) {
        synchronized (lock) {
            this.amount += value;
        }
    }

    public void minus(int value) {
        synchronized (lock) {
            this.amount -= value;
        }
    }

    public void addInterest(int value) {
        this.interest += value;
    }

    public int getAmount() {
        synchronized (amountLock) {
            return this.amount;
        }
    }
}
