package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static String compareNumbers( int num1, int num2) {
        if (num1 > num2) {
            return num1 + " is large than " + num2;
        } else if (num2 > num1) {
            return num2 + " is large than" + num1;
        } else {
            return "Both numbers are egual";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        String result = compareNumbers(number1, number2);
        System.out.println(result);
        scanner.close();
    }
}