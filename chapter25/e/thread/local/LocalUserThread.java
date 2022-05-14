package chapter25.e.thread.local;

public class LocalUserThread extends Thread{
    @Override
    public void run() {
        int value = ThreadLocalSample.generateNumber();
        System.out.println(this.getName() + " LocalUserThread value = " + value);

        OtherLogic otherLogic = new OtherLogic();
        otherLogic.printMyNumber();
        ThreadLocalSample.remove();
    }
}
