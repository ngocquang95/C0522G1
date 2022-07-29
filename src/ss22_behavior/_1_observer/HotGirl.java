package ss22_behavior._1_observer;

import java.util.ArrayList;
import java.util.List;

public class HotGirl implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void note() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void postToFacebook() {
        note();
    }
}
