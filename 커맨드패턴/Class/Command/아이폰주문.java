package 디자인패턴.커맨드패턴.Class.Command;

import 디자인패턴.커맨드패턴.Class.Client.주문자;
import 디자인패턴.커맨드패턴.Class.Receiver.애플스토어;
import 디자인패턴.커맨드패턴.Interface.Command;

public class 아이폰주문 implements Command {
    애플스토어 주문상점;
    String 색상;
    int 시리즈;
    int 용량;

    주문자 주문자;

    public 아이폰주문(애플스토어 주문상점, String 색상, int 시리즈, int 용량, 주문자 주문자) {
        this.주문상점 = 주문상점;
        this.색상 = 색상;
        this.시리즈 = 시리즈;
        this.용량 = 용량;
        this.주문자 = 주문자;
    }

    @Override
    public void execute() {
      주문자.받다(주문상점.아이폰주문(색상,시리즈,용량));
    }
}
