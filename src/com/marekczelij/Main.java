package com.marekczelij;

import designpatterns.behavioral.command.CommandDemo;
import designpatterns.behavioral.iterator.IteratorDemo;
import designpatterns.behavioral.memento.MementoDemo;
import designpatterns.behavioral.observer.ObserverDemo;
import designpatterns.behavioral.state.StateDemo;
import designpatterns.behavioral.strategy.StrategyDemo;
import designpatterns.behavioral.template.TemplateDemo;

public class Main {

    public static void main(String[] args) throws Exception {
        MementoDemo.runDemo();
        StateDemo.runDemo();
        IteratorDemo.runDemo();
        StrategyDemo.runDemo();
        TemplateDemo.RunDemo();
        CommandDemo.runDemo();
        ObserverDemo.runDemo();
    }
}
