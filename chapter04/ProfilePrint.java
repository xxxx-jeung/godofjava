public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte) 30);
        profilePrint.setName("오제웅");
        profilePrint.setMarried(false);

        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.isMarried());
    }

    public void setAge(byte pmage) {
        age = pmage;
    }

    public int getAge() {
        return age;
    }

    public void setName(String pmname) {
        name = pmname;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
