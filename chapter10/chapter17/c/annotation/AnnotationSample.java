package chapter10.chapter17.c.annotation;

public class AnnotationSample {
    @SuppressWarnings("deprecation")
    public void useDeprecated(){
        AnnotationOverride child = new AnnotationOverride();
        child.noMoreUse();
    }
}
