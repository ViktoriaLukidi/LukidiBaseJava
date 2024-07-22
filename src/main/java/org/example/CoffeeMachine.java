package org.example;
import static org.example.CoffeeMachine.milkLevel;
import static org.example.CoffeeMachine.waterLevel;

public class CoffeeMachine {

    private static final int ESPRESSO_WATER = 50;
    private static final int ESPRESSO_MILK = 0;

    private static final int CAPPUCCINO_WATER = 30;
    private static final int CAPPUCCINO_MILK = 20;

    static int waterLevel;
    static int milkLevel;

    private int maxWaterLevel;
    private int maxMilkLevel;

    private int drinksPrepared;
    private static final int CLEANING_THRESHOLD = 10;

    public CoffeeMachine(int maxWaterLevel, int maxMilkLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxMilkLevel = maxMilkLevel;
        waterLevel = maxWaterLevel;
        milkLevel = maxMilkLevel;
        drinksPrepared = 0;
    }

    public boolean prepareEspresso() {
        if (waterLevel < ESPRESSO_WATER) {
            System.out.println("Недостаточно воды для эсперессо!");
            return false;
        }
        waterLevel -= ESPRESSO_WATER;
        drinksPrepared++;
        checkIfNeedsCleaning();
        return true;
    }

    public boolean prepareCappuccino() {
        if (waterLevel < CAPPUCCINO_WATER) {
            System.out.println("Не достаточно воды для каппучино!");
            return false;
        }
        if (milkLevel < CAPPUCCINO_MILK) {
            System.out.println("Не достаточно молока для каппучино!");
            return false;
        }
        waterLevel -= CAPPUCCINO_WATER;
        milkLevel -= CAPPUCCINO_MILK;
        drinksPrepared++;
        checkIfNeedsCleaning();
        return true;
    }

    public void refillWater() {
        waterLevel = maxWaterLevel;
        System.out.println("Долив воды.");
    }

    public void refillMilk() {
        milkLevel = maxMilkLevel;
        System.out.println("Долив молока.");
    }

    private void checkIfNeedsCleaning() {
        if (drinksPrepared >= CLEANING_THRESHOLD) {
            cleanMachine();
            drinksPrepared = 0;
        }
    }

    private void cleanMachine() {
        System.out.println("Очистка кофемашины...");
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(1000, 500);

        coffeeMachine.prepareEspresso();
        coffeeMachine.prepareCappuccino();
        coffeeMachine.refillWater();
        coffeeMachine.refillMilk();
    }
}

enum DrinkType {
    ESPRESSO,
    CAPPUCCINO;

    static class CoffeeMachineException extends Exception {
        public CoffeeMachineException(String message) {
            super(message);
        }
    }

    public void makeDrink(DrinkType type) throws CoffeeMachineException {
    }

    public void makeCoffee(DrinkType type) throws CoffeeMachineException {
        switch (type) {
            case ESPRESSO:
                checkWaterLevel(50, "Недостаточно воды для эспрессо!");
                makeEspresso();
                break;
            case CAPPUCCINO:
                checkIngredients(30, 20, "Недостаточно ингредиентов для каппучино!");
                makeCappuccino();
                break;
            default:
                throw new CoffeeMachineException("Неизвестный напиток!");
        }
    }

    private void makeCappuccino() {
    }

    private void makeEspresso() {
    }

    private static void checkWaterLevel(int requiredWater, String errorMessage) throws CoffeeMachineException {
        if (waterLevel < requiredWater) {
            throw new CoffeeMachineException(errorMessage);
        }
    }

    private static void checkIngredients(int requiredWater, int requiredMilk, String errorMessage) throws CoffeeMachineException {
        if (waterLevel < requiredWater || milkLevel < requiredMilk) {
            throw new CoffeeMachineException(errorMessage);
        }
    }

    public String getRecipe(DrinkType type) {
        switch (type) {
            case ESPRESSO:
                return "Эспрессо: 50мл воды";
            case CAPPUCCINO:
                return "Капучино: 30мл воды, 20мл молока";
            default:
                return "Неизвестный рецепт";
        }
    }
}