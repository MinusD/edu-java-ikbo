package ru.minusd.zakatov.lab29.items;

public enum DrinkTypeEnum {
    BEER(true),
    WINE(true),
    VODKA(true),
    BRANDY(true),
    CHAMPAGNE(true),
    WHISKEY(true),
    TEQUILA(true),
    RUM(true),
    VERMOUTH(true),
    LIQUOR(true),
    JAGERMEISTER(true),
    JUICE(false),
    COFFEE(false),
    GREEN_TEA(false),
    BLACK_TEA(false),
    MILK(false),
    WATER(false),
    SODA(false);

    private final boolean isAlcoholic;

    DrinkTypeEnum(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
