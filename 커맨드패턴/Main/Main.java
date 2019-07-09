package 디자인패턴.커맨드패턴.Main;

import 디자인패턴.커맨드패턴.Class.Client.주문자;
import 디자인패턴.커맨드패턴.Class.Command.맥북주문;
import 디자인패턴.커맨드패턴.Class.Command.샌드위치주문;
import 디자인패턴.커맨드패턴.Class.Command.아이폰주문;
import 디자인패턴.커맨드패턴.Class.Invoker.배달부_엉이;
import 디자인패턴.커맨드패턴.Class.Receiver.서브웨이;
import 디자인패턴.커맨드패턴.Class.Receiver.애플스토어;
import 디자인패턴.커맨드패턴.Interface.Command;

public class Main {
    public static void main(String [] args) {
//        // 배달앱을 앱스토어에서 받았다!

//        // 메뉴를 고르고 주문항목을 선택했다.
//        Command 주문 = new 샌드위치주문(new 서브웨이(), "치킨로티세리");
//        // 배달앱에 장바구니에 주문을 넣어두고
//        배달앱.set주문(주문);
//        // 결제와 동시에 주문을 했다.
//        배달앱.주문요청();
//
//        Command 주문2 = new 샌드위치주문(new 서브웨이(), "아보카도쉬림프");
//        배달앱.set주문(주문2);
//        배달앱.주문요청();



        배달부_엉이 배달앱 =  new 배달부_엉이();
        애플스토어 코드스쿼드점 = new 애플스토어();

        주문자 부엉이 = new 주문자("🦉");
        Command 아이폰주문 = new 아이폰주문(코드스쿼드점,"블랙",11,64,부엉이);

        배달앱.set주문(아이폰주문);
        배달앱.주문요청();

        주문자 블루 = new 주문자("BLU");
        Command 맥북주문 = new 맥북주문(코드스쿼드점,"블랙","Pro",512,true,블루);

        배달앱.set주문(맥북주문);
        배달앱.주문요청();

    }
}
