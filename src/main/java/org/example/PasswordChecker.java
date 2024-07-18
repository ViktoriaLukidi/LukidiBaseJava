package org.example;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner scanneer = new Scanner(System.in);
        System.out.println("Введите пароль для проверки: ");
        String correctPassword = scanneer.nextLine();

        while (true) {
            System.out.println("Введите пароль: ");
            String inputPassword = scanneer.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Пароль верный. Программа завершена.");
                break;
            } else {
                System.out.println("Неверный пароль, попробуйте ещё раз: ");
            }
        }
        scanneer.close();
    }
}
