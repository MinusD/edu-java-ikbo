package ru.minusd.isaeva.lab02.task04;

public class PC {
    String model;
    String company;
    public PC(String company, String model){
        this.company=company;
        this.model=model;
    }
    public String getCompany() {
        return company;
    }
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
