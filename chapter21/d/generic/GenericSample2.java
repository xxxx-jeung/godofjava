package chapter21.d.generic;

public class GenericSample2 {
    public static void main(String[] args) {
        GenericSample2 sample2 = new GenericSample2();
        sample2.checkCastingDTO();
    }

    public void checkCastingDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        CastingGenericDTO<StringBuilder> dto2 = new CastingGenericDTO<StringBuilder>();
        CastingGenericDTO<StringBuffer> dto3 = new CastingGenericDTO<StringBuffer>();

        dto1.setObject(new String());
        dto2.setObject(new StringBuilder());
        dto3.setObject(new StringBuffer());

        String tmp1 = dto1.getObject();
        StringBuilder tmp2 = dto2.getObject();
        StringBuffer tmp3 = dto3.getObject();

    }
}
