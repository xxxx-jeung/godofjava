package chapter10.direct.c.inheritance;

public class Animal {
    String name;
    String kind;
    String legCount;
    String iq;
    String hasWing;
    int location;
    String food;
    String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", legCount='" + legCount + '\'' +
                ", iq='" + iq + '\'' +
                ", hasWing='" + hasWing + '\'' +
                ", location=" + location +
                ", food='" + food + '\'' +
                '}';
    }

    public void move(int location){
        this.location = location;
    }

    public int getMove(){
        return location;
    }

    public void eatFood(String food){
        this.food = food;
    }

    public String getEatFood(){
        return food;
    }
}
