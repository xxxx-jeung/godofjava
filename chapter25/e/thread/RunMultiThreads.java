package chapter25.e.thread;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads threads = new RunMultiThreads();
        threads.runMultiThread();
    }

    public void runMultiThread(){
        RunnableSample[] runnableSamples = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for(int loop=0; loop<5; loop++){
            runnableSamples[loop] = new RunnableSample();
            thread[loop] = new ThreadSample();

            new Thread(runnableSamples[loop]).start();
            thread[loop].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended.");
    }
}
