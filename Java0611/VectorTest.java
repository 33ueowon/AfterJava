package Java0611;

import java.awt.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
//        Vector<String> v= new Vector<String>();
        var v = new Vector<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 3명의 이름을 입력 : ");

        for (int i = 0;  i < 3;  i++){
            String name = sc.next();
            v.add(name);
        }
        System.out.println("* for문 출력");
        for (int i = 0; i < v.size(); i++){
            String s = v.get(i);
            System.out.print(s + " ");
        }
        Iterator<String> it = v.iterator();
        System.out.println("\n* Iterator 출력");
        while(it.hasNext()){
            String n = it.next();
            System.out.print(n + " ");
        }

    }
}
