package designpatterns.behavioral.visitor;

public class Reverb implements Operation{
    @Override
    public void process(FactSegment factSegment) {
        System.out.println("Reverb - factSegment");
    }

    @Override
    public void process(FormatSegment formatSegment) {
        System.out.println("Reverb - formatSegment");
    }
}
