package chapter22.d.collection;

import java.util.*;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5", "SM7", "SM3", "Tico"
        };
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars){
        if(cars==null) return 0;
        if(cars.length == 1) return 1;
        Set<String> carSet = new HashSet<>();
        for(String car : cars){
            carSet.add(car);
        }
        printCarSet2(carSet);
        return carSet.size();
    }

    public void printCarSet(Set<String> carSet){
        for(String temp : carSet){
            System.out.println("temp = " + temp);
        }
    }
    public void printCarSet2(Set<String> carSet){
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
