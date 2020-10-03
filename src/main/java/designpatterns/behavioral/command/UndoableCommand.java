package designpatterns.behavioral.command;

public interface UndoableCommand extends Command {
    void unexecute();
}
