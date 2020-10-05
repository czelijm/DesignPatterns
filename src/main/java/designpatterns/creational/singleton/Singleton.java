package designpatterns.creational.singleton;

public class Singleton implements ISingleton{
    private static Singleton INSTANCE = new Singleton();
    private int var1;
    private String var2;
    private Singleton() {
    }

    private static class SingletonReturner{
        public static Singleton getInstance(){
            return INSTANCE;
        }
    }

    public static Singleton getInstance(){
        return SingletonReturner.getInstance();
    }

    public int getVar1() {
        return var1;
    }

    public Singleton setVar1(int var1) {
        this.var1 = var1;
        return this;
    }

    public String getVar2() {
        return var2;
    }

    public Singleton setVar2(String var2) {
        this.var2 = var2;
        return this;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "var1=" + var1 +
                ", var2='" + var2 + '\'' +
                '}';
    }
}
