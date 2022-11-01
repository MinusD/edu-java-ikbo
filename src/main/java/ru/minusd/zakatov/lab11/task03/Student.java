package ru.minusd.zakatov.lab11.task03;

import java.util.Calendar;

public class Student {
    private String name;
    private Calendar birthday;
    private int gpa;

    public Student(String name, Calendar birthday, int gpa) {
        this.name = name;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    public String toString(char dateFormat) {
        String date = birthday.getTime().toString();

        if (dateFormat == 's') {
            date = String.format("%d-%d-%d",
                    birthday.get(Calendar.YEAR),
                    birthday.get(Calendar.MONTH) + 1,
                    birthday.get(Calendar.DAY_OF_MONTH)
            );
        } else if (dateFormat == 'm') {
            date = String.format("%d-%d-%d %02d:%02d:%02d",
                    birthday.get(Calendar.YEAR),
                    birthday.get(Calendar.MONTH) + 1,
                    birthday.get(Calendar.DAY_OF_MONTH),
                    birthday.get(Calendar.HOUR_OF_DAY),
                    birthday.get(Calendar.MINUTE),
                    birthday.get(Calendar.SECOND)
            );
        }

        return "Student{" +
                "name='" + name + '\'' +
                "birthday='" + date + '\'' +
                "gpa=" + gpa +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
