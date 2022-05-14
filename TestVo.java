public class TestVo {
    private long Id;
    private String name;
    private String number;

    public TestVo(long id, String name, String number) {
        this.Id = id;
        this.name = name;
        this.number = number;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TestVo testVo = (TestVo) o;
//
//        if (Id != testVo.Id) return false;
//        if (!name.equals(testVo.name)) return false;
//        return number.equals(testVo.number);
//    }

    @Override
    public int hashCode() {
        int result = (int) (Id ^ (Id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + number.hashCode();
        return result;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
