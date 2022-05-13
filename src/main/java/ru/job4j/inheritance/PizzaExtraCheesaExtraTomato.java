package ru.job4j.inheritance;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    private static final String EXTRA_TOMATO = "extra tomato";

    @Override
    public String name() {
        return super.name() + " + " + EXTRA_TOMATO;
    }
}
