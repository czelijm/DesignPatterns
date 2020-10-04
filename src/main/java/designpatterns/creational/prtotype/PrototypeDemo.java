package designpatterns.creational.prtotype;

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeDemo {
    public static void runDemo() {
        Point p1 = new Point(1,1);
        Point p2 = p1.deepCopy();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println(p2.setXY(2,2).toString());
        System.out.println(p1.toString());

        Line line1 = new Line(p1.deepCopy(),p2.deepCopy());
        System.out.println(line1);
        Line line2 = line1.deepCopy();
        System.out.println(line2.toString());

        System.out.println(line2.setP1P2(3,3,4,4).toString());
        System.out.println(line1);

        Line line3 = SerializationUtils.roundtrip(line1);
        System.out.println(line3);
        System.out.println(line3.setP1P2(5,5,6,6));
        System.out.println(line1);
        //SerializationUtils.deserialize(SerializationUtils.serialize(line1));
        Line line4 = line3.deepCopyUsingSerialization();
        System.out.println(line4);
        System.out.println(line4.setP1P2(7,7,8,8));
        System.out.println(line3);

    }
}
