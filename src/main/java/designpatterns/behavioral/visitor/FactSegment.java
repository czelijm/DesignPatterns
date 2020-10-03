package designpatterns.behavioral.visitor;

public class FactSegment extends Segment {
    @Override
    public void process(Operation operation) {
        operation.process(this);
    }
}
