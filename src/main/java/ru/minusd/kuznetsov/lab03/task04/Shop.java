package ru.minusd.kuznetsov.lab03.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer1 = new Computer(1, "Z-390", "Intel-i9-9900k", 32, 8);
        Computer computer2 = new Computer(2, "B-250", "Intel-i5-7400", 16, 4);
        Computer computer3 = new Computer(3, "AM4", "AMD-Ryzen-5-3600", 12, 6);
        ArrayList<Computer> computers = new ArrayList<Computer>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);


        boolean flag;
        int menu = 0;
        int article;
        String chipset;
        String processor;
        int RAM;
        int GPU;
        while (menu != 8) {
            System.out.println("What do you want to do?");
            System.out.println("0 - Print all computers in database");
            System.out.println("1 - Add computer to database");
            System.out.println("2 - Find computer in database by article");
            System.out.println("3 - Find computers in database by chipset");
            System.out.println("4 - Find computers in database by processor");
            System.out.println("5 - Find computers in database by GB of RAM");
            System.out.println("6 - Find computers in database by GB of GPU");
            System.out.println("7 - Delete computer from database by article");
            System.out.println("8 - Exit");
            System.out.print("Enter: ");
            menu = scanner.nextInt();
            flag = true;

            switch (menu) {
                case 0:
                    System.out.println("All computers in database:");
                    for (Computer c : computers)
                        System.out.println(c);
                    break;
                case 1:
                    System.out.print("Enter article: ");
                    article = scanner.nextInt();
                    boolean f = false;
                    int arr_size = computers.size();
                    do {
                        arr_size = computers.size();
                        for (Computer comp : computers) {
                            if (comp.getArticle() == article){
                                System.out.print("Such article is already exist! Enter another: ");
                                article = scanner.nextInt();
                                f =true;
                            }
                            arr_size--;
                        }
                        if (arr_size == 0) {
                            break;
                        }
                    } while (f);
                    System.out.print("Enter chipset: ");
                    chipset = scanner.next();
                    System.out.print("Enter processor: ");
                    processor = scanner.next();
                    System.out.print("Enter a number GB of RAM: ");
                    RAM = scanner.nextInt();
                    System.out.print("Enter a number GB of GPU: ");
                    GPU = scanner.nextInt();

                    Computer computer = new Computer(article, chipset, processor, RAM, GPU);
                    computers.add(computer);
                    System.out.println("Computer was added successfully!");
                    break;
                case 2:
                    System.out.print("Enter an article of the computer (int): ");
                    article = scanner.nextInt();
                    for (Computer c :
                            computers) {
                        if (c.getArticle() == article) {
                            System.out.println(c);
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        System.out.println("Computer with article = " + article + " wasn't found!");
                    break;
                case 3:
                    System.out.print("Enter a chipset of the computer: ");
                    chipset = scanner.next();
                    for (Computer c :
                            computers) {
                        if (c.getChipset().equals(chipset)) {
                            System.out.println(c);
                            flag = false;
                        }
                    }
                    if (flag)
                        System.out.println("Computers with chipset " + chipset + " wasn't found!");
                    break;
                case 4:
                    System.out.print("Enter a processor of the computer: ");
                    processor = scanner.next();
                    for (Computer c :
                            computers) {
                        if (c.getProcessor().equals(processor)) {
                            System.out.println(c);
                            flag = false;
                        }
                    }
                    if (flag)
                        System.out.println("Computers with processor " + processor + " wasn't found!");
                    break;
                case 5:
                    System.out.print("Enter a GB number of RAM of the computer: ");
                    RAM = scanner.nextInt();
                    for (Computer c :
                            computers) {
                        if (c.getRAM() == RAM) {
                            System.out.println(c);
                            flag = false;
                        }
                    }
                    if (flag)
                        System.out.println("Computers with " + RAM + " GB of RAM wasn't found!");
                    break;
                case 6:
                    System.out.print("Enter a GB number of GPU of the computer: ");
                    GPU = scanner.nextInt();
                    for (Computer c :
                            computers) {
                        if (c.getGPU() == GPU) {
                            System.out.println(c);
                            flag = false;
                        }
                    }
                    if (flag)
                        System.out.println("Computers with " + GPU + " GB of GPU wasn't found!");
                    break;
                case 7:
                    System.out.print("Enter an article of the computer: ");
                    article = scanner.nextInt();
                    for (Computer c :
                        computers) {
                    if (c.getArticle() == article) {
                        computers.remove(c);
                        System.out.println("Computer is completely deleted!");
                        break;
                    }
                }
                default:
                    break;
            }
        }
    }
}
