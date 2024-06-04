package Java0604;

import Java0523Point.Point;

import java.util.Vector;

public class PointEx {
    public static void main(String[] args) {
        var v = new Vector<Point>();

        v.add(new Point(2,3));
        v.add(new Point(-5,20));
        v.add(new Point(30,-8));

        v.remove(1);

        for (int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
}
