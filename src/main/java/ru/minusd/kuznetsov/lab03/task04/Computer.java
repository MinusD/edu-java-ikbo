package ru.minusd.kuznetsov.lab03.task04;

public class Computer {
    private int article = -1;
    private String chipset = "unknown chipset";
    private String processor = "unknown processor";
    private int RAM = -1;
    private int GPU = -1;

    public Computer(int article, String chipset, String processor, int RAM, int GPU) {
        this.article = article;
        this.chipset = chipset;
        this.processor = processor;
        this.RAM = RAM;
        this.GPU = GPU;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getGPU() {
        return GPU;
    }

    public void setGPU(int GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer Article: " + article +
                ", Chipset: '" + chipset + '\'' +
                ", Processor: '" + processor + '\'' +
                ", RAM = " + RAM +
                ", GPU = " + GPU;
    }
}
