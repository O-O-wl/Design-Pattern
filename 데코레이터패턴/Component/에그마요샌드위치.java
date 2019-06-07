package 디자인패턴.데코레이터패턴.Component;

public class 에그마요샌드위치 extends 샌드위치 {
    @Override
    public int 가격을가져오다() {
        return 4300;
    }

    @Override
    public String toString() {
        return "에그마요샌드위치";
    }
}
