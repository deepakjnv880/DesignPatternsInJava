package design.patterns.behavioral.observer.storeWarehouse;

/**
    https://leetcode.com/discuss/interview-experience/5654245/Walmart-or-SDE-III-or-Bangalore-or-August-2024-Offer
    not able to recall question but something like warehouse and stores are two entities in walmart needs to update stores when any new inventory comes in to warehouse.
    store to warehouse 1:1 mapping
    warehouse to store 1:N mapping
    remark : I have solved using observer pattern and interviewer also looking for the same
    asked multiple question around implementation.
 **/

public class Driver {
    public static void main(String[] args) {
        Store store1=new Store("Store1");
        Store store2=new Store("Store2");
        Store store3=new Store("Store3");


        Warehouse warehouse1=new Warehouse("Warehouse1");
        Warehouse warehouse2=new Warehouse("Warehouse2");

        warehouse1.addObserver(store1);
        warehouse1.addObserver(store2);

        warehouse2.addObserver(store3);

        warehouse1.addItem(880);
        warehouse2.addItem(881);

        warehouse2.addObserver(store2);

        warehouse1.addItem(882);
        warehouse2.addItem(883);

    }
}
