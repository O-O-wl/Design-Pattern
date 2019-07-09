package 디자인패턴.커맨드패턴.Class.Receiver;

public class 서브웨이 {

    class 샌드위치 {
        String 메뉴이름;
        public 샌드위치(String 메뉴이름){
            this.메뉴이름 = 메뉴이름;
        }
        public String toString(){
            return this.메뉴이름+"🥙";
        }
    }

    public void 샌드위치주문(String 메뉴이름) {
        샌드위치 주문메뉴 = new 샌드위치(메뉴이름);
        System.out.println(주문메뉴+"배달하였습니다.");
    }


}
