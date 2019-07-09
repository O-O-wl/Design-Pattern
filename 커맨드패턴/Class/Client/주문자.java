package 디자인패턴.커맨드패턴.Class.Client;

public class 주문자 {
    String 이름;

    public 주문자(String 이름) {
        this.이름 = 이름;
    }

    public void 받다(Object 제품) {
        System.out.println(이름+"은 "+제품+"을 받았다");
    }
}
