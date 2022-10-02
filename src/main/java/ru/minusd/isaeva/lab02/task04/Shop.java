package ru.minusd.isaeva.lab02.task04;

public class Shop {
    int max = 10;
    int count = 0;
    PC pcs[] = new PC[max];

    public PC[] getPcs() {
        return pcs;
    }
    public void print() {
        for(int i = 0; i < count; i++ ){
            System.out.println(getPcs()[i].getCompany() + " "
                    + getPcs()[i].getModel());
        }
    }
    public void addPC(String company, String model){
        PC pc = new PC(company,model);
        pcs[count] = pc;
        count++;
    }
    public int findPC(String company, String model){
        for (int i=0; i<count; i++){
            if ((pcs[i].getCompany().equals(company)) & (pcs[i].getModel().equals(model))){
                return i;
            }
        }
        return -1;
    }
    public void deletePC(int index){
       for(int i = index; i < count; i++ ){
           pcs[i]=pcs[i+1];
       }
       count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
