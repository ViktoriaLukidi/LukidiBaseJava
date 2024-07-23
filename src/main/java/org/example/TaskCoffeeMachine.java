package org.example;

import static java.lang.System.exit;
import static java.lang.System.out;
import static org.example.DrinkType.CAPPUCCINO;

public class TaskCoffeeMachine {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine (50, 30, 20);
        ListMenuButton event = null;
        while (true) {
            coffeeMachine.getIsOn();//проверка вкл выкл
            coffeeMachine.printMenu();
            event = coffeeMachine.inputItem();
            switch (event) {
                case EXIT -> exit(0);
                case POWER_ON -> coffeeMachine.getIsOn();
                case PRINT_CAPPUCCINO -> coffeeMachine.printDrinkType(CAPPUCCINO);
                case CLEAR_MACHINE -> coffeeMachine.cleanMachine();
                case ADD_WATER -> coffeeMachine.getWaterLevel();
                case ADD_COFFEE -> coffeeMachine.refillCoffee("Coffe");
                case ADD_MILK -> coffeeMachine.getMilkLevel();
                case PREPARE_CAPPUCCINO -> coffeeMachine.prepareCappuccino();
                case PREPARE_ESPRESSO -> coffeeMachine.prepareEspresso();
                default -> out.println("ошибка");
            }
        }
    }
    }