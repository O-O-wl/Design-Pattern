package 디자인패턴.커맨드패턴.Class.Command;

import 디자인패턴.커맨드패턴.Class.Client.주문자;
import 디자인패턴.커맨드패턴.Class.Receiver.애플스토어;
import 디자인패턴.커맨드패턴.Interface.Command;


public class 맥북주문 implements Command {
    애플스토어 주문상점;
    String 색상;
    String 라인;
    int 용량;
    boolean 키보드마우스추가;
    주문자 주문자;

    public 맥북주문(애플스토어 주문상점, String 색상, String 라인, int 용량, boolean 키보드마우스추가, 주문자 주문자) {
        this.주문상점 = 주문상점;
        this.색상 = 색상;
        this.라인 = 라인;
        this.용량 = 용량;
        this.키보드마우스추가 = 키보드마우스추가;
        this.주문자 = 주문자;
    }

    @Override
    public void execute() {
        주문자.받다(주문상점.맥북주문(색상,라인,용량,키보드마우스추가));
    }
}
