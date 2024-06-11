package Java0611;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        System.out.println("* for문 출력");
        for (int i = 0; i < v.size(); i++){
            int n = v.get(i);
            System.out.print(n + " ");
        }
        Iterator<Integer> it = v.iterator();
        System.out.println("\n* Iterator 출력");
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n + " ");
        }

        //Iterator를 이용해 백터원소 합 구하기
        int sum = 0;
        it = v.iterator();  //Interator 객체 얻기
        while (it.hasNext()){
            int n = it.next();
            sum += n;
        }
        System.out.println("\n* 백터안의 데이터의 합: " + sum);
    }
}
