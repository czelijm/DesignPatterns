package designpatterns.creational.singleton;

public class IsSingletonChecker {
    public static boolean IsSingleton(Object o1, Object o2) {
        return o1 == o2;
    }
}
