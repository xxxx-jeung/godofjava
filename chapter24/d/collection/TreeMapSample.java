package chapter24.d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample treeMapSample = new TreeMapSample();
        treeMapSample.checkTreeMap();
    }

    public void checkTreeMap(){
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> tempEntry : entrySet){
            System.out.println("tempEntry = " + tempEntry.getKey());
            //System.out.println("tempEntry = " + tempEntry.getValue());
        }

    }
}
