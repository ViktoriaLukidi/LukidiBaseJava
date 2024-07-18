package org.example;


public class PrimitiveMinMaxValues {
    public static void main(String[] args) {
        System.out.println("Char - Min Value:" + Character.MIN_VALUE +", Max Value:" + Character.MAX_VALUE);
        System.out.println("Boolean - Min Value:" + Boolean.FALSE + ", Max Value:" + Boolean.TRUE);
        System.out.println("Byte - Min Value:" + Byte.MIN_VALUE + ", Max Value:" + Byte.MAX_VALUE);
        System.out.println("Short - Min Value:" + Short.MIN_VALUE + ", Max Value:" + Short.MAX_VALUE);
        System.out.println("Int - Min Value:" + Integer.MIN_VALUE + ", Max Value:" + Integer.MAX_VALUE);
        System.out.println("Long - Min Value:" + Long.MIN_VALUE + ", Max Value:" + Long.MAX_VALUE);
        System.out.println("Float - Min Value:" + Float.MIN_VALUE + ", Max Value:" + Float.MAX_VALUE);
        System.out.println("Double - Min Value:" + Double.MIN_VALUE + ", Max Value" + Double.MAX_VALUE);

        String value1 = "Значение 1";
        String value2 = "Значение 2";
        String value3 = "Значение 3";
        String output = "value1:" + value1 + "\\nvalue 2:" + value2 + "\\nvalue 3:" + value3;
        System.out.println(output);

        String[] strArray = { "молоко", "мясо", "хлеб" };
        System.out.println(String.join(", ", strArray));

    }
}