package 디자인패턴.데코레이터패턴.Decorator;

import 디자인패턴.데코레이터패턴.Component.샌드위치;

public class 더블치즈추가된샌드위치 extends 옵션이추가된샌드위치 {
    int 추가금액 = 800;

    public 더블치즈추가된샌드위치(샌드위치 샌드위치) {
        super(샌드위치);
    }

    @Override
    public int 가격을가져오다() {
        return this.샌드위치.가격을가져오다() + this.추가금액;
    }

    @Override
    public String toString() {
        return 샌드위치.toString() + ", 더블치즈";
    }

}
