package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer o){
        this.observerList.add(o);
    }

    public void removeObserver(Observer o)
    {
        this.observerList.remove(o);
    }

    protected void notifyObservers()
    {
        for (Observer observer: observerList) {
            observer.update(this);
        }
    }

}
