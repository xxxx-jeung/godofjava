package chapter25.e.thread.atomic;

import static chapter25.e.thread.atomic.RunThreadSample.object;
import static chapter25.e.thread.atomic.RunThreadSample.testVo;

public class TestThreadMinus implements Runnable{
    @Override
    public void run() {
        for(int loop = 0; loop < 1000; loop++) {
            synchronized (object) {
                testVo.minus();
            }
        }
    }
}
