package designpatterns.behavioral.template;

public abstract class WindowTemplate {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        beforeClose();
        doClose();
        afterClose();
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }

    protected void beforeClose() { return; }
    protected void afterClose() { return; }
    protected void doClose(){ System.out.println("Removing the window from the screen"); }

}
