package designpatterns.creational.prtotype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

public class Line implements DeepCopy, Serializable {
    public Point p1;
    public Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line setP1P2(int x1, int y1, int x2, int y2){
        this.p1.setXY(x1,y1);
        this.p2.setXY(x2,y2);
        return this;
    }

    public Line deepCopyUsingSerialization() {
        return SerializationUtils.roundtrip(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1.toString() +
                ", p2=" + p2.toString() +
                '}';
    }

    @Override
    public Line deepCopy() {
        return new Line(p1.deepCopy(), p2.deepCopy());
    }
}
