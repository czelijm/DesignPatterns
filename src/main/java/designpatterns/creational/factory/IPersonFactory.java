package designpatterns.creational.factory;

import java.lang.reflect.InvocationTargetException;

public interface IPersonFactory {
    IPerson createPerson(String name) throws IllegalAccessException, InvocationTargetException, InstantiationException;
}
