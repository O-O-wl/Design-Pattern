package 디자인패턴.데코레이터패턴.Decorator;
import 디자인패턴.데코레이터패턴.Component.샌드위치;

public abstract class 옵션이추가된샌드위치 extends 샌드위치 {
    샌드위치 샌드위치;
    int 추가금액;

    public 옵션이추가된샌드위치(샌드위치 샌드위치) {
        this.샌드위치 = 샌드위치;
    }
}
