package designpatterns.behavioral.memento;

public class DocumentState {
    public String content;
    public String fontName;
    public int fontSize;

    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentState(Document d)
    {
        this.content = d.getContent();
        this.fontName = d.getFontName();
        this.fontSize = d.getFontSize();
    }

}
