package designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState documentState) {
        states.add(documentState);
    }

    public DocumentState pop() {
        DocumentState lastState = states.get(states.size()-1);
        states.remove(lastState);

        return lastState;
    }

}
