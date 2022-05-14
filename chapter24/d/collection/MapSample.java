package chapter24.d.collection;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkContains();
        System.out.println();
    }

    public void checkHashMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }

    public void checkKeySet(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<String> keySet = map.keySet();
        for(String val : keySet){
            System.out.println(val);
            System.out.println(map.get(val));
        }
    }

    public void checkValues(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Collection<String> values = map.values();
        for(String val : values){
            System.out.println("val = " + val);
        }
    }

    public void checkHashMapEntry(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> temp : entries){
            System.out.println("temp.getKey() = " + temp.getKey());
            System.out.println("temp.getValue() = " + temp.getValue());
        }
    }

    public void checkContains(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("B"));
        System.out.println(map.containsKey("C"));
        System.out.println(map.containsKey("D"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsKey("w"));
        System.out.println(map.containsKey("z"));
        System.out.println(map.containsValue("A"));
        System.out.println(map.containsValue("c"));
        System.out.println(map.containsValue("d"));
    }


}
