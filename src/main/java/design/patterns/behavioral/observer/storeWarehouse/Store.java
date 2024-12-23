package design.patterns.behavioral.observer.storeWarehouse;

public class Store implements Observer {
    private final String storeName;
    private Subject warehouse;

    public Store(String storeName){
        this.storeName=storeName;
    }

    @Override
    public Subject getSubject() {
        return warehouse;
    }

    @Override
    public void setSubject(Subject subject) {
        removeSubject();
        this.warehouse=subject;
    }

    @Override
    public void removeSubject() {
        if(warehouse!=null)warehouse.getObservers().remove(this);
        this.warehouse=null;
    }

    @Override
    public void update(String notification) {
        System.out.println("Received some update in "+storeName+" ==> "+notification);
    }
}
