package chapter25.e.thread.atomic;

import java.util.concurrent.locks.Lock;

public class RunThreadSample {
    static AtomicTestVo atomicTestVo = new AtomicTestVo();
    static TestVo testVo = new TestVo();
    static Object object = new Object();

    public static void main(String[] args) {
        RunThreadSample sample = new RunThreadSample();
        sample.TestRunThreadMethod();
//        sample.TestRunAtomicRunnable();
    }

    public void TestRunThreadMethod(){
        TestThreadPlus plus = new TestThreadPlus();
        TestThreadMinus minus = new TestThreadMinus();

        Thread thread1 = new Thread(plus);
        Thread thread2 = new Thread(minus);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(testVo.returnVal());

    }

    public void TestRunAtomicRunnable() {
        AtomicRunnablePlus plus = new AtomicRunnablePlus();
        AtomicRunnableMinus minus = new AtomicRunnableMinus();

        Thread thread1 = new Thread(plus);
        Thread thread2 = new Thread(minus);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(atomicTestVo.returnVal());
    }
}
