package ru.minusd.gizatullina.lab06.task10;



public class Computer {
    private Memory memory;
    private Monitor monitor;
    private Processor processor;
    private Mark mark;
    private String name;

    public Computer(Memory memory, Monitor monitor, Processor processor, Mark mark, String name) {
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
        this.mark = mark;
        this.name = name;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                ", mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }
}

enum Mark
{
    MARK1,
    MARK2,
    MARK3,
    MARK4
}