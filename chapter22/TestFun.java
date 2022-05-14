package chapter22;

@FunctionalInterface
public interface TestFun {
    void test();
    default void test2(){

    }
}
