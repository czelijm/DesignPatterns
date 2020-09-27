package designpatterns.behavioral.visitor;

public class Normalize implements Operation {
    @Override
    public void process(FactSegment factSegment) {
        System.out.println("Normalize - factSegment");
    }

    @Override
    public void process(FormatSegment formatSegment) {
        System.out.println("Normalize - formatSegment");
    }
}
