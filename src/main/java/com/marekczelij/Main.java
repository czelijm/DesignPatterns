package com.marekczelij;

import designpatterns.behavioral.chainofresponsibilities.ChainOfResponsibilitiesDemo;
import designpatterns.behavioral.command.CommandDemo;
import designpatterns.behavioral.iterator.IteratorDemo;
import designpatterns.behavioral.mediator.MediatorDemo;
import designpatterns.behavioral.memento.MementoDemo;
import designpatterns.behavioral.observer.ObserverDemo;
import designpatterns.behavioral.state.StateDemo;
import designpatterns.behavioral.strategy.StrategyDemo;
import designpatterns.behavioral.template.TemplateDemo;
import designpatterns.behavioral.visitor.VisitorDemo;
import designpatterns.creational.builder.BuilderDemo;
import designpatterns.creational.factory.FactoryDemo;
import designpatterns.structural.adapter.AdapterDemo;
import designpatterns.structural.bridge.BridgeDemo;
import designpatterns.structural.composite.CompositeDemo;
import designpatterns.structural.decorator.DecoratorDemo;
import designpatterns.structural.facade.FacadeDemo;
import designpatterns.structural.flyweight.FlyweightDemo;
import designpatterns.structural.proxy.ProxyDemo;

import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {
        behavioralPatterns();
        structuralPatterns();
        creationalPatterns();
    }

    public static void behavioralPatterns() throws Exception {
        System.out.println("Behavioral patterns==============================");
        MementoDemo.runDemo();
        StateDemo.runDemo();
        IteratorDemo.runDemo();
        StrategyDemo.runDemo();
        TemplateDemo.RunDemo();
        CommandDemo.runDemo();
        ObserverDemo.runDemo();
        MediatorDemo.runDemo();
        ChainOfResponsibilitiesDemo.runDemo();
        VisitorDemo.runDemo();
    }
    public static void structuralPatterns() {
        System.out.println("Structural patterns==============================");
        CompositeDemo.runDemo();
        AdapterDemo.runDemo();
        DecoratorDemo.runDemo();
        FacadeDemo.runDemo();
        FlyweightDemo.runDemo();
        BridgeDemo.runDemo();
        ProxyDemo.runDemo();
    }
    public static void creationalPatterns() {
        System.out.println("Creational patterns==============================");
        BuilderDemo.runDemo();
        FactoryDemo.runDemo();
    }

}
