package ru.minusd.bulgakova.lab03.task04;
import java.util.ArrayList;
import java.util.List;


public class Shop {
    public int countComputers;
    public List<Computer> comp;
    public Shop(){
        comp = new ArrayList<Computer>();
    }
    public void addComputer(String name){
        comp.add(new Computer(name));
    }
    public void findComputer(String name){
        for (Computer computer : comp) {
            if (computer.name.equals(name)) {
                comp.remove(computer);
                System.out.println("found");
                return;
            }
        }
        System.out.println("didn't find");
    }
}

