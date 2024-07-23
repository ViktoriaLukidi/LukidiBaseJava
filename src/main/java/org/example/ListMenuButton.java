package org.example;

public enum ListMenuButton {
    EXIT("Вход в систему"),
    POWER_ON("Включение/Выключение"),
    PRINT_CAPPUCCINO("Напечатать рецепт каппучино"),
    CLEAR_MACHINE("Очистка машины"),
    ADD_WATER("Вода"),
    ADD_COFFEE("Кофе"),
    ADD_MILK("Молоко"),
    PREPARE_CAPPUCCINO("Каппучино"),
    PREPARE_ESPRESSO("Эспрессо"),
    SHOW_LOG("Показать список"),
    PROFILES("Профили");

    public final String text;

    ListMenuButton(String text) {
        this.text = text;
    }
}

