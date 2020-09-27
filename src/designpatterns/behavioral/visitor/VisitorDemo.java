package designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {
    public static void runDemo() {

        WavFile wavFile = WavFile.read("SanQuentin");

        NoiseReduce noiseReduce = new NoiseReduce();
        Reverb reverb = new Reverb();
        Normalize normalize = new Normalize();

        List<Operation> operations = new ArrayList<>();
        operations.add(noiseReduce);
        operations.add(normalize);
        operations.add(reverb);

        for (Operation o: operations) {
            wavFile.execute(o);
        }
    }
}
