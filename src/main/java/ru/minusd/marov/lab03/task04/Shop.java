package ru.minusd.marov.lab03.task04;

import java.util.ArrayList;

public class Shop{
    private static int i = 0;

    private String address;
    private String working_hours;
    public ArrayList<Computer> warehouse = new ArrayList<>();

    public Shop(String address, String working_hours){
        this.address = address;
        this.working_hours = working_hours;
    }

    public void addComputer(int index, String  CPU, String GPU, String RAM, String SSD){
        Computer a = new Computer(index, CPU, GPU, RAM, SSD);
        warehouse.add(i, a);
        i++;
    }

    public void deleteComputer(int index){
        for (int j = 0; j < warehouse.size(); j++) {
            if(warehouse.get(j).index == index){
                warehouse.remove(j);
                break;
            }
        }
        System.out.println("Computer has been deleted");
    }

    public void search(int index){
        for (int j = 0; j < warehouse.size(); j++)
            if(warehouse.get(j).index == index) {
                System.out.println("Computer available");
                return;
            }
        System.out.println("Computer is not available atm");
    }
}
