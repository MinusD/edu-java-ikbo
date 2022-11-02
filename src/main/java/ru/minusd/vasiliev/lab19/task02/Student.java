package ru.minusd.vasiliev.lab19.task02;

public class Student implements ComparableStudent {
    private String name;
    private int average;

    public Student(String name, int average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getAverage() {
        return average;
    }

    public void setName(String name) throws EmptyStringException {
        if (name.equals("")) {
            throw new EmptyStringException("Имя не может быть пустой строкой");
        }
        this.name = name;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.average, o.average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
