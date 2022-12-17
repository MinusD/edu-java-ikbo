package ru.minusd.gizatullina.lab20.task04;

public class MinMax <N extends Comparable<N>> {
    private N[] array;

    public MinMax(N[] array) {
        this.array = array;
    }

    public N getMin() {
        N min = array[0];
        for (N n : array) {
            if (n.compareTo(min) < 0) {
                min = n;
            }
        }
        return min;
    }

    public N getMax() {
        N max = array[0];
        for (N n : array) {
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {78, 25, 3, 44, 50};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("Max number: ");
        System.out.println(minMax.getMax());
        System.out.println("Min number: ");
        System.out.println(minMax.getMin());
    }
}