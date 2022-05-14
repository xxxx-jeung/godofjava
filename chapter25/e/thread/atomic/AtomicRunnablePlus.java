package chapter25.e.thread.atomic;

import static chapter25.e.thread.atomic.RunThreadSample.atomicTestVo;

public class AtomicRunnablePlus implements Runnable{
    @Override
    public void run() {
        for(int loop = 0; loop < 1000; loop++){
            atomicTestVo.plusVal();
        }
    }
}
