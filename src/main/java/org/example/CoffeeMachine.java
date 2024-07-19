package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {
    private boolean isOn;
    private int water;
    private int coffee;
    private int milk;
    private final int MAX_WATER_LEVEL = 2000;
    private final int MAX_COFFE_LEVEL = 500;
    private final int MAX_MILK_LEVEL = 1000;

    public CoffeeMachine() {
        this.isOn = false;
        this.water = 0;
        this.coffee = 0;
        this.milk = 0;
    }
    public class CoffeeMachineException extends Exception {
        public CoffeeMachineException(String message) {
            super(message);
        }
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void addWater(int amount) throws CoffeeMachineException {
        if (water + amount > MAX_WATER) {
            throw new CoffeeMachineException("Too much water!");
        }
        water += amount;
    }

    public void addCoffee(int amount) throws CoffeeMachineException {
        if (coffee + amount > MAX_COFFEE) {
            throw new CoffeeMachineException("Too much coffee!");
        }
        coffee += amount;
    }

    public void addMilk(int amount) throws CoffeeMachineException {
        if (milk + amount > MAX_MILK) {
            throw new CoffeeMachineException("Too much milk!");
        }
        milk += amount;
    }

    public int checkWaterLevel() {
        return water;
    }

    public int checkMilkLevel() {
        return milk;
    }

    public boolean hasCoffee() {
        return coffee > 0;
    }


    public class Main {
        public static void main(String[] args) {
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Выбрать опцию");
                System.out.println("1. Включить");
                System.out.println("2. Выключить");
                System.out.println("3. Добавить воды");
                System.out.println("4. Добавить молока");
                System.out.println("5. Добавить кофе");
                System.out.println("6. Проверить уворень воды");
                System.out.println("7. Проверить уровень молока");
                System.out.println("8. Проверить уровень кофе");
                System.out.println("9. Проверить уровень загрязнения");
                System.out.println("10. Очистка");
                System.out.println("11. Сделать эсспресо");
                System.out.println("12. Сделать каппучино");
                System.out.println("13. Выход");
                int option = scanner.nextInt();

                try {
                    switch (option) {
                        case 1:
                            coffeeMachine.turnOn();
                            Logger.log("Включить");
                            break;
                        case 2:
                            coffeeMachine.turnOff();
                            Logger.log("Выключить");
                            break;

                        scanner.close();
                    }
                } finally {

                }