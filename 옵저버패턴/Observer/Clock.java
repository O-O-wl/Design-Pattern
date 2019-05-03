package 디자인패턴.옵저버패턴.Observer;

import java.time.format.DateTimeFormatter;

public class Clock implements Observer,Displayable{

    String currentTime ;
    String name;
    boolean form24;

    public Clock(String currentTime, String name, boolean form24) {
        this.currentTime = currentTime;
        this.name = name;
        this.form24 = form24;
    }

    @Override
    public void update(int hour, int min, int sec) {
        int finalHour = form24 ? hour : hour%12;
        currentTime = finalHour+"시 "+min+"분 "+sec+"초";
        display();
    }

    @Override
    public void display() {
        System.out.println(name);
        System.out.println(currentTime);
    }
}
