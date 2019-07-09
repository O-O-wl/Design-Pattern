package 디자인패턴.커맨드패턴.Class.Invoker;

import 디자인패턴.커맨드패턴.Interface.Command;

public class 배달부_엉이 {

    Command 주문;

    public void set주문(Command 주문) {
        this.주문 = 주문;
    }

    public void 주문요청(){
        주문.execute();
    }
}
