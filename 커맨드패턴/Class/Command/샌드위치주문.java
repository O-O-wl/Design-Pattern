package 디자인패턴.커맨드패턴.Class.Command;

import 디자인패턴.커맨드패턴.Class.Receiver.서브웨이;
import 디자인패턴.커맨드패턴.Interface.Command;

public class 샌드위치주문 implements Command {

    서브웨이 서브웨이;
    String 메뉴이름;

    public 샌드위치주문(서브웨이 서브웨이,String 메뉴이름) {
        this.서브웨이 = 서브웨이;
        this.메뉴이름 = 메뉴이름;
    }

    @Override
    public void execute() {
        서브웨이.샌드위치주문(메뉴이름);
    }
}
