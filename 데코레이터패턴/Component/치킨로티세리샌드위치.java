package 디자인패턴.데코레이터패턴.Component;

public class 치킨로티세리샌드위치 extends 샌드위치 {
    @Override
    public int 가격을가져오다() {
        return 5990;
    }

    @Override
    public String toString() {
        return "치킨로티세리샌드위치";
    }
}
