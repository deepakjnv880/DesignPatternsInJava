package design.patterns.behavioral.observer.storeWarehouse;

public interface Observer {
    Subject getSubject();
    void setSubject(Subject subject);
    void removeSubject();
    void update(String notification);
}
