package lab02.task04;


import java.util.ArrayList;

public class Shop {

    private int l;
    private ArrayList<Computer> computers;

    public Shop(int l, ArrayList<Computer> computers) {
        this.l = l;
        this.computers = computers;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void addPC(ArrayList<Computer> list, Computer computer) {
        list.add(computer);
    }
    public void delPC(ArrayList<Computer> list, Computer computer) {
        list.remove(computer);;
    }
}
