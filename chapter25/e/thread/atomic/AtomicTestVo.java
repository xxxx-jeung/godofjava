package chapter25.e.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTestVo {
    private AtomicInteger Id = new AtomicInteger(0);

    public void plusVal(){
        Id.incrementAndGet();
    }

    public void minusVal(){
        Id.decrementAndGet();
    }

    public int returnVal(){
        return Id.intValue();
    }
}
