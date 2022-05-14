public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setAge(20);
        profile.setName("Min");

        profile.printName();
        profile.printAge();
    }

    public void setName(String str) {
        name = str;
    }

    public void setAge(int val) {
        age = val;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }
}
