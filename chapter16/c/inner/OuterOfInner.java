package chapter16.c.inner;

public class OuterOfInner {
    class Inner {
        private int value = 0;
        public int getValue(){
            return this.value;
        }

        public void setValue(int value){
            this.value = value;
        }
    }
}
