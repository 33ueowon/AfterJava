package Java05282;

class Point {
    private int x,y;
    public Point(int x, int y){
        this.x = x; this.y = y;
    }
    public boolean equals(Object j){
        Point j = (Point)obj;
        if(x == j.x && y == j.y)
            return true;
        else return false;
    }
}
