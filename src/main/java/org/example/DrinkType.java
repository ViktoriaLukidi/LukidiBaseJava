package org.example;

public enum DrinkType {
    ESPRESSO(50,0,5),
    CAPPUCCINO(50, 30, 5);

    private int water;
    private int milk;
    private int coffee;

    DrinkType(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void printRecipe() {

    }
}

