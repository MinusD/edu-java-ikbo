package ru.minusd.gizatullina.lab23;

public abstract class AbstractQueue implements Queue {
    protected int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Object element() {
        assert size > 0;
        return doElement();
    }

    protected abstract Object doElement();

    public void clear() {
        size = 0;
        doClear();
    }

    protected abstract void doClear();

    public void enqueue(Object element) {
        assert element != null;
        doEnqueue(element);
        size++;
    }

    protected abstract void doEnqueue(Object element);

    public Object dequeue() {
        assert size > 0;
        Object result = doDequeue();
        size--;
        return result;
    }

    protected abstract Object doDequeue();
}