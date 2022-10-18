package ru.minusd.vasiliev.lab06.task13;

public class BuilderListener implements EventListener {
    @Override
    public void update(String event, StringBuilder builder) {
        System.out.printf("%s произошло. Результат: %s\n", event, builder);
    }
}
