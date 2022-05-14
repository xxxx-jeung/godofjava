package chapter22.d.collection;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
    }

    public void checkPeek(){
        Stack<Integer> intStack = new Stack<>();
        for(int loop=0; loop<5; loop++){
            intStack.push(loop);
            if(!intStack.empty()){
                System.out.println(intStack.pop());
            }
        }
        System.out.println(intStack.size());
    }
}
