package Java05282;

public class PointEx {
    Point a = new Point(2,3);
    Point b = new Point(2,3);
    Point c = new Point(3,4);

    if(a == b){
        System.out.println("a == b");
    }
    if(a.equals(b)){
        System.out.println("a is equal to b");
    }
    if(a.equals(c)){
        System.out.println("a is equls to cs");
    }
}
