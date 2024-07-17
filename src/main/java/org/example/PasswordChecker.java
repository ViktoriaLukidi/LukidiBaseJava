package org.example;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner scanneer = new Scanner(System.in);
        String correctPassword = "myPassword";
        System.out.println("Введите пароль: ");

        while (true) {
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
