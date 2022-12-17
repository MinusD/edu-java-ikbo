package ru.minusd.gizatullina.lab29;

public class OrderAlreadyAddedException extends Exception{
    private String address;
    public OrderAlreadyAddedException(String add) {
        super("Order already added");
        address = add;
    }

    public String getMessage() {
        return super.getMessage() + ": " + address;
    }
}