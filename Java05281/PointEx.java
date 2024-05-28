package Java05281;

public class PointEx {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = a;
        if (a == b) //false
            System.out.println("a==b");
        if(a == c) //true
            System.out.println("a==c");
    }
}
