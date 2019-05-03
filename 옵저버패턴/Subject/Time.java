package 디자인패턴.옵저버패턴.Subject;


import 디자인패턴.옵저버패턴.Observer.Observer;

import java.util.ArrayList;

public class Time implements Subject {

    private int hour;
    private int min;
    private int sec;
    ArrayList<Observer> observers = new ArrayList<>();

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(this.hour,this.min,this.sec);
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
