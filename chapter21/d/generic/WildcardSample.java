package chapter21.d.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildCard("A");
        wildcardStringMethod(wildcard);

        WildcardGeneric<Integer> wildCardInteger = new WildcardGeneric<>();
        wildCardInteger.setWildCard(123);
        wildcardStringMethod(wildCardInteger);
    }

    /**
     *
     * @param c 와일드카드<?> 는 매개변수에 사용하는 것을 원칙으로 한다.
     */
    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.getWildCard();
        if(value instanceof String){
            System.out.println("value = " + value);
        } else if(value instanceof Integer){
            System.out.println("value = " + value);
        }
    }
}
