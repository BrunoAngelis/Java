package br.com.abc.javacore.wrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1 ;
        short shortPrimitivo = 1 ;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shotWrapper = 1;
        Integer  integerWrapper = new Integer ("10");
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(Character.isDigit(1));
        System.out.println(f);
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));



    }
}
