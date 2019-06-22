package 디자인패턴.데코레이터패턴;

import 디자인패턴.데코레이터패턴.Component.*;
import 디자인패턴.데코레이터패턴.Decorator.*;

import java.util.ArrayList;

public class main {
    public static void main(String [] args) {
        샌드위치 나의샌드위치 = new 치킨로티세리샌드위치();
        나의샌드위치 = new 아보카도추가된샌드위치(나의샌드위치);
        나의샌드위치 = new 아보카도추가된샌드위치(나의샌드위치);
        나의샌드위치 = new 베이컨추가된샌드위치(나의샌드위치);

        System.out.println(나의샌드위치);
        //치킨로티세리샌드위치, 아보카도, 아보카도, 베이컨


        ArrayList<String> a = new ArrayList<String>(10);

        System.out.println(a.size());
        a.add(0,"C++");
        a.add(0,"C++");
        System.out.println(a);
        System.out.println(a.size());
        a.remove(a.size()-1);
        System.out.println(a);
    }
}
