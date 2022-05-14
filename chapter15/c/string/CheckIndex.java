package chapter15.c.string;

import java.util.Arrays;

public class CheckIndex {
    public static void main(String[] args) {
        CheckIndex index = new CheckIndex();
        index.checkSubstring();
    }

    public void checkIndexOf(){
        String text = "Java technology is both a programming language and a platform.";

    }

    public void checkLastIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.lastIndexOf('a') = " + text.lastIndexOf('a'));
        System.out.println("text.lastIndexOf(\"a \") = " + text.lastIndexOf("a "));
        System.out.println("text.lastIndexOf('a', 20) = " + text.lastIndexOf('a', 20));
        System.out.println("text.lastIndexOf(\"a \", 20) = " + text.lastIndexOf("a ", 20));
        System.out.println("text.lastIndexOf('z') = " + text.lastIndexOf('z'));
    }

    public void checkSubstring(){
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println("technology = " + technology);
        CharSequence charSequence = "test";
        System.out.println(charSequence.subSequence(0,4));
    }
}
