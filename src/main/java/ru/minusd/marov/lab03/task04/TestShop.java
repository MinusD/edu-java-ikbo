package ru.minusd.marov.lab03.task04;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("damn street 4206669", "23:00 - 23:30");
        System.out.println("Enter the amount of computers ");
        int numberC = scanner.nextInt();
        int currentIndex;
        String currentCPU, currentGPU, currentRAM, currentSSD;
        for (int i = 0; i < numberC; i++) {
            System.out.println("Enter the ID");
            currentIndex = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the CPU");
            currentCPU = scanner.nextLine();
            System.out.println("Enter the GPU");
            currentGPU = scanner.nextLine();
            System.out.println("Enter the RAM");
            currentRAM = scanner.nextLine();
            System.out.println("Enter the SSD");
            currentSSD = scanner.nextLine();
            shop.warehouse.add(i, new Computer(currentIndex, currentCPU, currentGPU, currentRAM, currentSSD));
            if (i == numberC - 1) {
                System.out.println("Database updated");
            } else {
                System.out.println("\nNext computer\n");
            }
        }
        shop.search(2);
    }
}