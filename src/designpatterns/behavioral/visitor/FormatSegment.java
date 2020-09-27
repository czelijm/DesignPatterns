package designpatterns.behavioral.visitor;

public class FormatSegment extends Segment {
    @Override
    public void process(Operation operation) {
        operation.process(this);
    }
}
