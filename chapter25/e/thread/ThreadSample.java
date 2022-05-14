package chapter25.e.thread;

public class ThreadSample extends Thread{
    private int threadCount = 0;
    public ThreadSample() {
        super("ThreadName");

    }

    @Override
    public void run(){
        System.out.println("This is ThreadSample's run() method.");
    }
}
