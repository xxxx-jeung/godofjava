package chapter21.d.generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }

    public void checkCastingDTO(){
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        String temp = (String) dto1.getObject();
        StringBuffer stringBuffer = (StringBuffer) dto2.getObject();
        StringBuilder stringBuilder = (StringBuilder) dto3.getObject();
    }
}
