package ru.minusd.kuznetsov.lab02.task02;
import java.util.*;

/*
Пр№2 Задание №2)
Написать генератор целочисленного массива
Элемент изменяется от 0 до 100
Массив динамический
Ввод кол-ва элементов
Вывод кол-ва элементов
На ввод число и оно(все, если несколько) удаляется из массива
После удаления вывод массива без этих чисел, в скобках длина массива
В конце ввод цифры от 0 до 9, удаление всех, оканчивающихся на это число
 */
public class Pr2_2 {
    public static void printArrayList(ArrayList arrayList)
    {
        for(int i = 0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("Length: " + arrayList.size());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter len of array list: ");
        int len = scanner.nextInt();
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (int i = 0; i < len; i++) {
            arrayList.add(random.nextInt(100));
        }

        printArrayList(arrayList);
        System.out.print("Enter a num you want to delete: ");
        int delNum = scanner.nextInt();

        arrayList.removeAll(Collections.singleton(delNum));
        printArrayList(arrayList);

        System.out.print("Enter a last digit of numbers, with which numbers you want to delete: ");
        delNum = scanner.nextInt();

        int elem;
        int index = 0;
        while (index!= arrayList.size()) {
            elem = arrayList.get(index);
            if (elem % 10 == delNum){
                arrayList.removeAll(Collections.singleton(elem));
                index--;
            }
            index++;
        }
        printArrayList(arrayList);
    }
}