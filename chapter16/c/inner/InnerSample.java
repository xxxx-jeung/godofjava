package chapter16.c.inner;

public class InnerSample {
    public static void main(String[] args) {
        InnerSample innerSample = new InnerSample();
        innerSample.makeInnerObject();
    }

    public void makeInnerObject(){
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();

        inner.setValue(3);
        System.out.println("inner.getValue() = " + inner.getValue());

    }
}
