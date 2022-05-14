package chapter15.c.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull stringNull = new StringNull();
        stringNull.nullCheck2(null);
    }

    public boolean nullCheck(String text){
        int textLength = text.length();
        System.out.println("textLength = " + textLength);
        if(text==null) return true;
        else return false;
    }
    public boolean nullCheck2(String text){
        if(text==null){
            return true;
        } else {
            int textLength=text.length();
            System.out.println("textLength = " + textLength);
            return false;
        }
    }
}
