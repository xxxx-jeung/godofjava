package chapter16.c.inner.practice;

public class MyPage {
    InputBox input;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUi();
        myPage.pressKey();
    }

    public void setUi(){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override public void onKeyDown() { System.out.println("Key Down"); }
            @Override public void onKeyUp() { System.out.println("Key Up"); }
        };
        input.setKeyListener(listener);
    }

    public void pressKey(){
        input.listenerCalled(2);
        input.listenerCalled(4);
    }

}
