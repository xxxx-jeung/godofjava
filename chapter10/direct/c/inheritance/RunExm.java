package chapter10.direct.c.inheritance;

public class RunExm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.move(3);
        dog.eatFood("bob");
        dog.setSound("왈왈");

        cat.move(4);
        cat.eatFood("meet");
        cat.setSound("야옹");

        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
