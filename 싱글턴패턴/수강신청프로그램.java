package 디자인패턴.싱글턴패턴;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class 수강신청프로그램 {

    final static int 정원 = 3;
     int 현재인원 = 0;
     int 갯수 = 0;
    private static 수강신청프로그램 싱글톤;

    private 수강신청프로그램() { }

    public static synchronized 수강신청프로그램 인스턴스가져오기() {
        if (싱글톤 == null) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            싱글톤 = new 수강신청프로그램();
        }
        return 싱글톤;
    }

    public synchronized void 수강신청() {
        boolean 가능여부 = 수강과목.수강가능여부();
        if (가능여부) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            수강과목.수강신청();
        }
    }

}