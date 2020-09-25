package designpatterns.behavioral.iterator;

public class ArrayIterator<T> implements Iterator {
    private T[] array; // = (T[]) new Object[10];
    private int index = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public Object current() {
        return array[index];
    }

    @Override
    public boolean hasNext() {
        return index < array.length && array[index]!=null;
    }
}
