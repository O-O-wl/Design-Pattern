package 디자인패턴.싱글턴패턴;

public class 클라이언트 extends Thread {
    @Override
    public void run() {
        super.run();
        수강신청프로그램 프로그램 = 수강신청프로그램.인스턴스가져오기();
        프로그램.수강신청();
    }
}
