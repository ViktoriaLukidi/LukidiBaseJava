package org.example;

public enum ListMenuButton {
    ADD_COFFEE("Добавить кофе"),
    ADD_MILK("Добавить молока"),
    ADD_WATER("Добавить воды"),
    CLEAR_MACHINE("Очистка машины"),
    EXIT("Выход из системы"),
    POWER_ON("Включение/Выключение"),
    PREPARE_CAPPUCCINO("Капучино"),
    PREPARE_ESPRESSO("Эспрессо"),
    PRINT_CAPPUCCINO("Напечатать рецепт каппучино"),

    public final String, text()text;

    ListMenuButton(String text) {
        this.text = text;
    }
    }
