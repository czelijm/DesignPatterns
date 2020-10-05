package designpatterns.creational.singleton;

public class SingletonDemo {
    public static void runDemo() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = singleton.getInstance();

        singleton.setVar1(3);
        singleton.setVar2("XD");

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton1.setVar1(5));
        System.out.println(singleton);

        System.out.println(IsSingletonChecker.IsSingleton(singleton,singleton1));
        System.out.println(IsSingletonChecker.IsSingleton(new Integer(2),new Integer(2)));
        System.out.println(new Integer(2).equals(new Integer(2)));
    }
}
