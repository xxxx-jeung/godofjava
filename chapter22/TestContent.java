package chapter22;

import java.util.Vector;

public class TestContent {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("TEST");
        vector.add("TEST");
        vector.add("TEST");
        vector.add("TEST");
        vector.add("TEST");

        for(String tmp : vector){
            System.out.println(tmp);
        }

    }
}
