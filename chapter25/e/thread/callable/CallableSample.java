package chapter25.e.thread.callable;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

public class CallableSample {
    public static void main(String[] args) {
        CallableSample sample = new CallableSample();
        sample.callableThread1();
    }

    public void callableThread1(){
        CallableThread thread = new CallableThread();
        Map<String, Object> Test = new HashMap<>();
        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
        FutureTask<String> futureTask = new FutureTask<>(thread);
        Thread t = new Thread(futureTask);
        t.start();

        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
