package ru.minusd.budkov.lab02.task04;

import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();
    void addComputer(Computer computer){
        computers.add(computer);
    }
    void deleteComputer(String name){
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).name.equals(name)){
                computers.remove(i);
            }
        }
    }
    void findComputer(String name){
        boolean flag = false;
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).name.equals(name)) {
                flag = true;
            }
        }
        if(flag){
            System.out.println("Есть в наличии");
        }
        else{
            System.out.println("Нет в наличии");
        }
    }
}
