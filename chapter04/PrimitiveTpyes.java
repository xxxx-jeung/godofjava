public class PrimitiveTpyes {
    public static void main(String[] args) {
        PrimitiveTpyes primitiveTpyes = new PrimitiveTpyes();
        primitiveTpyes.checkByte();
        primitiveTpyes.checkChar();
    }

    public void longTest() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println(byteMin);
        System.out.println(byteMax);

        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);
        System.out.println("==" + byteMin);
        System.out.println("==" + byteMax);
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("===========" + charMin);
        System.out.println("===========" + charMax);
        int a = 'a';
        System.out.println("===========" + a);

    }
}