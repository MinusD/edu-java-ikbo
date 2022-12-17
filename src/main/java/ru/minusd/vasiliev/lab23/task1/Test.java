package ru.minusd.vasiliev.lab23.task1;

public class Test {
    public static void main(String[] args) {
        System.out.println("ArrayQueue: ");
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());
        }

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());
        }
        System.out.println("==============");
        System.out.println("ArrayQueueADT: ");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queueADT, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueADT.dequeue(queueADT));
        }

        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.push(queueADT, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueADT.dequeue(queueADT));
        }
        System.out.println("==============");
        System.out.println("ArrayQueueModule: ");
        ArrayQueueModule queueModule = new ArrayQueueModule();
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueModule.dequeue());
        }

        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueModule.dequeue());
        }
    }
}
