package designpatterns.behavioral.iterator;
import java.util.List;

public class ListIterator<T> implements Iterator {
    private List<T> array;
    private int index = 0;

    public ListIterator(List<T> array) {
        this.array = array;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public T current() {
        return array.get(index);
    }

    @Override
    public boolean hasNext() {
        return index < array.size();
    }
}
