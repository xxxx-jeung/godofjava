package midterminspection.c.middle;

public enum EmployeeType {
    OWNER(1, -95),
    MANAGER(2, 10),
    DESIGNER(3, 20),
    ARCHITECT(4, 30),
    DEVELOPER(5, 100);

    final int value;
    final double rate;

    EmployeeType(int value, double rate) {
        this.value = value;
        this.rate = rate;
    }

    public int getValue() {
        return value;
    }

    public double getRate() {
        return rate;
    }
}
