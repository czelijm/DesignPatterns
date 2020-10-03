package designpatterns.behavioral.template;

public class Window extends WindowTemplate {
    @Override
    protected void beforeClose() {
        System.out.println("Starting the window closing procedure");
    }

    @Override
    protected void afterClose() {
        System.out.println("Stopping the window closing procedure");
    }
}
