package designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    protected void notifyObservers(){
        for (Observer o : observers){
            o.update();
        }
    }
}
