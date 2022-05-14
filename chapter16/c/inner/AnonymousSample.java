package chapter16.c.inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        //sample.setButtonListener();
        sample.setButtonListenerAnonymousObject();
    }

    public void setButtonListener(){
        MagicButton button = new MagicButton();
        MagicButtonListener magicButtonListener = new MagicButtonListener();
        button.setListener(magicButtonListener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous(){
        MagicButton button = new MagicButton();
        int bb3 = 0;
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                int bb = 0;
                System.out.println("Magic Button Clicked !!!!" + bb3);
            }
        });
        button.onClickProcess();
    }

    public void setButtonListenerAnonymousObject(){
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }
}
