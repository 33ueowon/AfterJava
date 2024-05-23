package Java0523Point;

public class Point {   //클래스
    private int x,y;    //필드
    public Point() {}   //defalt 생성자
    public Point(int x,int y){  //생성자(constructor)
        this.x = x;     //필드 초기화
        this.y = y;
    }
    @Override
    public String toString(){
        return "x 위치 : " + x + ", y 위치 : " + y;
    }
}
