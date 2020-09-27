package designpatterns.behavioral.visitor;

public class NoiseReduce implements Operation {

    @Override
    public void process(FactSegment factSegment) {
        System.out.println("Noise reduction - factSegment");
    }

    @Override
    public void process(FormatSegment formatSegment) {
        System.out.println("Noise reduction - formatSegment");
    }
}
