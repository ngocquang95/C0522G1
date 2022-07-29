package ss22_behavior._1_observer;

public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void note();
}
