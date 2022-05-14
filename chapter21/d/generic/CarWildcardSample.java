package chapter21.d.generic;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod(){
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildCard(new Car("Mustang"));
        boundWildcardMethod(wildcard);
    }

    public void callBusBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildCard(new Bus("6900"));
        boundWildcardMethod(wildcard);
    }

    public void boundWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildCard();
        System.out.println("value = " + value);
    }

}
