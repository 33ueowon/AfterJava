package Java0604;

import java.util.Vector;

public class VectorEx2 {
    public static void main(String[] args) {
        var v = new Vector<Student>();

        v.add(new Student("홍길동",15));
        v.add(new Student("이길동",17));

        for (int i = 0; i < v.size(); i++){
            System.out.println(v);
        }
        printStudent(v);
    }
    static void printStudent(Vector<Student> s){
        for (int i = 0; i < s.size(); i++){
            System.out.println(s);
        }

    }
}
