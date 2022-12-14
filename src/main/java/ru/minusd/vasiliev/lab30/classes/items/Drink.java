package ru.minusd.vasiliev.lab30.classes.items;

import ru.minusd.vasiliev.lab30.interfaces.Alcoholable;

public class Drink extends MenuItem implements Alcoholable {
    private final boolean isAlcohol;
    private final double alcoholVol;

    public Drink(int cost, String name, String description, boolean isAlcohol, double alcoholVol) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.isAlcohol = isAlcohol;
    }

    @Override
    public boolean isAlcoholDrink() {
        return isAlcohol;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
