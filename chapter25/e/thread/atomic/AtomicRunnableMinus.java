package chapter25.e.thread.atomic;

import static chapter25.e.thread.atomic.RunThreadSample.atomicTestVo;

public class AtomicRunnableMinus implements Runnable{
    @Override
    public void run() {
        for(int loop = 0; loop < 1000; loop++) {
            atomicTestVo.minusVal();
        }
    }
}
