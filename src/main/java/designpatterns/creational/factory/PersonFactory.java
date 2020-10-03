package designpatterns.creational.factory;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonFactory implements IPersonFactory {
//    private Map<String, ? extends IPerson> factories = new HashMap<String, IPerson>();
//    private Map<String, Class<? extends IPerson>> factories = new HashMap<>();
//    private Map<String, IPerson> factories = new HashMap<>();
    private Map<String, Constructor<? extends IPerson>> factories = new HashMap<>();
    private int numberOfCreatedObjects = 0;

    public PersonFactory(){
        Set<Class<? extends IPerson>> iPersonSubTypes  = new Reflections("designpatterns.creational.factory").getSubTypesOf(IPerson.class);
        for (Class<? extends IPerson> iPerson : iPersonSubTypes) {
            try {
                factories.put(iPerson.getSimpleName(),iPerson.getDeclaredConstructor(int.class, String.class));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public IPerson createPerson(String name){
        IPerson result = null;
        try {
            result = factories.get("Person").newInstance(numberOfCreatedObjects++,name);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
