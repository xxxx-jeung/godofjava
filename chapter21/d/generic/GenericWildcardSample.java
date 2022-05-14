package chapter21.d.generic;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod();
    }

    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "Data");
    }

    /**
     * <S,T extends Car> 제네릭 타입으로 선언한 메소드에 타입 범위를 지정할 수 있다.
     * S, T 타입이면서 Car 클래스 상속받은 클래스만 메소드에 접근 할 수 있다.
     * @param c
     * @param addValue T, S 매개변수 중 하나만 사용해도 문제 없다. ex) 메소드 (0...N)
     * @param another
     * @param <S>
     * @param <T>
     */
    public <S,T extends Car> void multiGenericMethod(WildcardGeneric<T> c, T addValue, S another){

    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue){

        c.setWildCard(addValue);
        T value = c.getWildCard();
        System.out.println("value = " + value);
    }
}
