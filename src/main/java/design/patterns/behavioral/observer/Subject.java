package design.patterns.behavioral.observer;

public interface Subject {

    void subscribe(Object object);

    void unsubscribe(Object object);

    void upload(String title);

    void notifySubscribers(String title);
}
