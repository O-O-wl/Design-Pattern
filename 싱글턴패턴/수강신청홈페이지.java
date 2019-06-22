package 디자인패턴.싱글턴패턴;

public class 수강신청홈페이지 {
    public static void main (String args[]) {
        클라이언트 학생1 = new 클라이언트();
        클라이언트 학생2 = new 클라이언트();
        클라이언트 학생3 = new 클라이언트();
        클라이언트 학생4 = new 클라이언트();
        클라이언트 학생5 = new 클라이언트();

        학생1.start();
        학생2.start();
        학생3.start();
        학생4.start();
        학생5.start();

    }


}
