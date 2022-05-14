package chapter25.e.thread.atomic;

public class TestVo {
    private Integer Id = 0;

    public void plus(){
        Id++;
    }

    public void minus(){
        Id--;
    }

    public int returnVal(){
        return Id;
    }

}
