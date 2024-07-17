package org.example;


import java.util.Scanner;

public class PrimeNumberFinder {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void displayPrimeNumbers( int min, int max) {
        System.out.println("Prime numbers between" + min + "and" + max + ":");
        for (int i = min; i<= max; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum number of the interval:");
        int min = scanner.nextInt();

        System.out.println("Enter the maximum number of the interval:");
        int max = scanner.nextInt();

        displayPrimeNumbers(min, max);
        // method call
        scanner.close();
    }
}