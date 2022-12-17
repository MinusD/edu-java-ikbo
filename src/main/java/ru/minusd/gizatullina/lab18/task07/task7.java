package ru.minusd.gizatullina.lab18.task07;

import java.util.Scanner;

public class task7 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.nextLine();
        if(key == ""){
            System.out.println("Key set to empty string");
            key = myScanner.nextLine();
        }
        printDetails(key);
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key == "") {
            try {
                throw new Exception("Key set to empty string");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "data for " + key;
    }
    public static void main(String[] args){
        task7 demo = new task7();
        demo.getKey();
    }
}
