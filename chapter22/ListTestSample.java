package chapter22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTestSample {
    public static void main(String[] args) {
        ListTestSample sample = new ListTestSample();
        sample.listObjectTest();

    }

    public void listObjectTest(){
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");
        list.add("test");

//        Vector<String> vector;
//        vector = (Vector<String>) list;
//
//        for(String tmp : vector){
//            System.out.println("tmp = " + tmp);
//        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList = (LinkedList<String>) list;

        for(String tmp : linkedList){
            System.out.println("tmp = " + tmp);
        }
    }

    public void arrayListObjectTest(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");

        List<String> list = new ArrayList<>();
        list = arrayList;

        Vector<String> vector = new Vector<>();
        //vector = arrayList;

        LinkedList<String> stringList = new LinkedList<>();
        //stringList = (LinkedList) arrayList;
    }
}
