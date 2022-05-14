package chapter25.e.thread.callable;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("START --------------------------");
        System.out.println("문자열 선언");
        String runTestStr = "생성되었습니다.";
        System.out.println("END   --------------------------");
        return runTestStr;
    }
}
