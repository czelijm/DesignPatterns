package designpatterns.creational.prtotype;

import java.io.Serializable;

public class Point implements DeepCopy, Serializable {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point setXY(int x, int y){
        this.x = x;
        this.y = y;
        return this;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Point deepCopy() {
        return new Point(x,y);
    }
}
