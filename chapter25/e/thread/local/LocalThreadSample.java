package chapter25.e.thread.local;

public class LocalThreadSample {
    public static void main(String[] args) {
        LocalThreadSample sample = new LocalThreadSample();
        for(int loop = 0; loop < 3; loop++){
            sample.threadRun();
        }
    }

    public void threadRun(){
        LocalUserThread thread = new LocalUserThread();
        thread.start();
    }
}
