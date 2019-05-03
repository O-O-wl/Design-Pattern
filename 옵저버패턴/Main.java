package 디자인패턴.옵저버패턴;

import 디자인패턴.옵저버패턴.Observer.Clock;
import 디자인패턴.옵저버패턴.Subject.Time;

import java.util.Scanner;

public class Main {
    public static void main(String []arg){
        Time time = new Time(9,19,10);
        Clock clock = new Clock("10시20분20초","롤렉스",true);
        Clock clock2 = new Clock("10시20분20초","오메가",false);
        time.registerObserver(clock);
        time.registerObserver(clock2);

        while(true){
            int menu = ask("1.시간보기, 2.시간 설정 ");
            switch(menu){
                case 1:
                    clock.display();
                    clock2.display();
                case 2:
                    setTime(time);
            }
        }
    }

    public static int ask(String q){
        System.out.println(q);
        return new Scanner(System.in).nextInt();
    }

    public static void setTime(Time time){
        time.setHour(ask("몇 시?"));
        time.setMin(ask("몇 분?"));
        time.setSec(ask("몇 초?"));
        time.notifyObserver();
    }




}
