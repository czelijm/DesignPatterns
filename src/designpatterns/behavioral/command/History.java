package designpatterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UndoableCommand> commands = new ArrayDeque<>();

    void push(UndoableCommand command){
        commands.add(command);
    }

    UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }

}
