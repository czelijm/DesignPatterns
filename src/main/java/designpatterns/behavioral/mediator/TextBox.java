package designpatterns.behavioral.mediator;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

    protected boolean isEmpty(){
        return this.content == null || this.content.isEmpty();
    }

}
