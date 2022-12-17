package ru.minusd.marov.lab03.task07;

public class Bookshelf {
    private Book[] warehouse;

    public Bookshelf(int n) {
        this.warehouse = new Book[n];
    }

    public Bookshelf() {
        this.warehouse = new Book[0];
    }

    public void setWarehouse(Book warehouse[]) {
        this.warehouse = warehouse;
    }


    public void print(){
        for (int i = 0; i < warehouse.length; i++) {
            System.out.println("Author: "+warehouse[i].getAuthor());
            System.out.println("Name: "+warehouse[i].getName());
            System.out.println("Year: "+warehouse[i].getYear());

        }
    }

    public void minYear(){
        int minYear = warehouse[0].getYear();
        for (int i = 0; i < 3; i++) {
            if(warehouse[i].getYear() < minYear){
                minYear = warehouse[i].getYear();
            }
        }
        System.out.println("Min year: "+minYear);
    }

    public void maxYear(){
        int maxYear = warehouse[0].getYear();
        for (int i = 0; i < 3; i++) {
            if(warehouse[i].getYear() > maxYear){
                maxYear = warehouse[i].getYear();
            }

        }
        System.out.println("Max year: "+maxYear);
    }

    public void sort_by_year(){
        for (int i = warehouse.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if( warehouse[j].getYear() < warehouse[j + 1].getYear() ) {
                    Book tmp = warehouse[j];
                    warehouse[j] = warehouse[j + 1];
                    warehouse[j + 1] = tmp;
                }
            }
        }
    }
}
