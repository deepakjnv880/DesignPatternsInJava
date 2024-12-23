package design.patterns.behavioral.observer.storeWarehouse;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

public class Warehouse implements Subject {
    private final String warehouseName;
    private final Set<Observer> observerSet;

    public Warehouse(String warehouseName){
        observerSet=new HashSet<>();
        this.warehouseName=warehouseName;
    }

    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);
        observer.setSubject(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
        observer.setSubject(null);
    }

    @Override
    public void notifyObservers(String notification) {
        for(Observer observer: observerSet){
            observer.update(notification);
        }
    }

    public void addItem(int itemNumber){
        String message= String.format("In warehouse %s, One item has been added with item number [%d] .",warehouseName,itemNumber);
        System.out.println("Notifying stores");
        notifyObservers(message);
    }

    @Override
    public Set<Observer> getObservers() {
        return observerSet;
    }
}
