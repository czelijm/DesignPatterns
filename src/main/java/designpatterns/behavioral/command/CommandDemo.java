package designpatterns.behavioral.command;

public class CommandDemo {
    public static void runDemo() {
        System.out.println("-------------------------Command demo------------------------------");
        History history = new History();

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.setText("XXDD");
        System.out.println(videoEditor.getText());

        RemoveTextCommand removeTextCommand = new RemoveTextCommand(videoEditor,history);
        removeTextCommand.execute();
        System.out.println(videoEditor.getText());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(videoEditor.getText());

        SetContrastCommand setContrastCommand = new SetContrastCommand(history,videoEditor,0.75f);
        setContrastCommand.execute();
        System.out.println(videoEditor.getContrast());

        undoCommand.execute();
        System.out.println(videoEditor.getContrast());

    }
}
