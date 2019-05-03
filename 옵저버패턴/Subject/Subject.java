package 디자인패턴.옵저버패턴.Subject;

import 디자인패턴.옵저버패턴.Observer.Observer;

import java.util.ArrayList;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
