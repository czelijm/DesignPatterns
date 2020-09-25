package designpatterns.behavioral.command;

public class RemoveTextCommand implements UndoableCommand {
    private String pervState;
    private VideoEditor videoEditor;
    private History history;

    public RemoveTextCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        this.pervState = videoEditor.getText();
        this.videoEditor.removeText();
        this.history.push(this);
    }

    @Override
    public void unexecute() {
        this.videoEditor.setText(this.pervState);
    }
}
