package designpatterns.behavioral.visitor;

public interface Operation {
    void process(FactSegment factSegment);
    void process(FormatSegment formatSegment);
}
