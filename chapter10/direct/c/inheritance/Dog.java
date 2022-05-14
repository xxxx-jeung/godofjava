package chapter10.direct.c.inheritance;

public class Dog extends Animal{
    @Override
    public String toString() {
        return "Dog{" +
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
        this.location = location;
    }

    @Override
    public void eatFood(String food) {
        this.food = food;
    }


}
