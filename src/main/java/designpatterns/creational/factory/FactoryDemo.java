package designpatterns.creational.factory;

import java.lang.reflect.InvocationTargetException;

public class FactoryDemo {
    public static void runDemo() {
        PersonFactory personFactory = new PersonFactory();
        IPerson john = personFactory.createPerson("John");
        IPerson wick = personFactory.createPerson("wick");
        System.out.println(john.toString());
        System.out.println(wick.toString());
    }

}
