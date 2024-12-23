package design.patterns.behavioral.observer.storeWarehouse;

import java.util.Set;

public interface Subject {
    void addObserver(Observer observer);
    Set<Observer> getObservers();
    void removeObserver(Observer observer);
    void notifyObservers(String notification);
}
