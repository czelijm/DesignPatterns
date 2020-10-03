package designpatterns.behavioral.command;

public class SetContrastCommand implements UndoableCommand{
    private History history;
    private VideoEditor videoEditor;
    private float pervState;
    private float contrast;

    public SetContrastCommand(History history, VideoEditor videoEditor, float contrast) {
        this.history = history;
        this.videoEditor = videoEditor;
        this.contrast = contrast;
    }

    @Override
    public void unexecute() {
        this.videoEditor.setContrast(this.pervState);
    }

    @Override
    public void execute() {
        pervState = videoEditor.getContrast();
        videoEditor.setContrast(this.contrast);
        history.push(this);
    }
}
