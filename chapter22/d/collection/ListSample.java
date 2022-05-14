package chapter22.d.collection;

import java.util.*;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList1();
//        sample.checkArrayList2();
        sample.checkArrayList8();
    }

    public void checkArrayList1(){
        var list1 = new ArrayList<>();
        var map = new HashMap<String, Object>();
        list1.add(1);list1.add("asd");list1.add(3);list1.add(1);
        System.out.println("list1 = " + list1);
        for(Object abc : list1){
            System.out.println(abc.getClass());
        }
    }
    public void checkArrayList2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");

        System.out.println(list.indexOf("C"));
        ArrayList<String> list2 = new ArrayList<>(list);
        for(String str : list2){
            System.out.println("List2 str = " + str);
        }
    }
    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
    }
    public void checkArrayList7(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String[] tempArray = new String[0];
        String[] strList = list.toArray(tempArray);
        for(String temp : strList){
            System.out.println("temp = " + temp);
        }
    }
    public void checkArrayList8(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list.removeAll(list1);
        for (String temp : list){
            System.out.println("temp = " + temp);
        }
    }
    public void checkArrayList9(){
        List list = Collections.synchronizedList(new ArrayList());
    }
}
