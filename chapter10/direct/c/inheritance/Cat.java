package chapter10.direct.c.inheritance;

public class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", legCount='" + legCount + '\'' +
                ", iq='" + iq + '\'' +
                ", hasWing='" + hasWing + '\'' +
                ", location=" + location +
                ", food='" + food + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }

    @Override
    public void move(int location) {
        super.move(location);
    }

    @Override
    public void eatFood(String food) {
        super.eatFood(food);
    }
}
