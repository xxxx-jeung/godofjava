public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue array = new ArrayInitValue();
        // array.referenceTypes();
        array.referenceTypesSetValue();
    }

    public void referenceTypes() {
        String[] strings = new String[2];
        ArrayInitValue[] arrayInitValue = new ArrayInitValue[2];
        System.out.println("string[0]=" + strings[0]);
        System.out.println("array[0]=" + arrayInitValue[0]);
    }

    public void referenceTypesSetValue() {
        String[] strings = new String[2];
        ArrayInitValue[] array = new ArrayInitValue[2];
        strings[0] = "Please visit www.";
        array[0] = new ArrayInitValue();
        System.out.println("string[0]=" + strings[0]);
        System.out.println("string[1]=" + strings[1]);
        System.out.println("array[0]=" + array[0].toString());
        System.out.println("array[1]=" + array[1]);

    }
}
