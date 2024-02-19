package design.patterns;

import design.patterns.behavioral.observer.Channel;
import design.patterns.behavioral.observer.Object;
import design.patterns.behavioral.observer.Subject;
import design.patterns.behavioral.observer.Subscriber;
import design.patterns.creational.builder.Phone;
import design.patterns.creational.builder.PhoneBuilder;
import design.patterns.creational.factory.OperatingSystem;
import design.patterns.creational.factory.OperatingSystemFactory;
import design.patterns.creational.prototype.Library;
import design.patterns.structural.adapter.Charger;
import design.patterns.structural.adapter.ChargerAdapter;
import design.patterns.structural.adapter.SamsungMobile;
import design.patterns.structural.adapter.myExample.ChargerAdapterForCFromB;
import design.patterns.structural.adapter.myExample.MobileCType;
import design.patterns.structural.composite.Component;
import design.patterns.structural.composite.CompositeNode;
import design.patterns.structural.composite.LeafNode;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("\n\n*************Welcome in the world of design patterns*************\n\n");


        System.out.println("\n------>Creational design patterns<-----");
        System.out.println("=======Factory design pattern=======");
        OperatingSystem os = new OperatingSystemFactory().getOperatingSystem("mac");
        os.show();
        System.out.println("=======Builder design pattern=======");
        Phone phone = new PhoneBuilder().setCompany("Samsung").setMemory(128).setOs("Android").getPhone();
        System.out.println(phone);
        System.out.println("=======Prototype design pattern=======");
        Library library1 = new Library("LibraryName1");
        library1.loadBooks();
        System.out.println(library1);
        Library library2 = new Library("LibraryName2");
        library2.loadBooks();//see we are again loading book which is time expensive
        System.out.println(library2);
        Library library3 = library1.clone();//with simple inbuilt clone it will be shallow copy, so we override the clone method for deep copy
        library3.setName("LibraryName3");
        System.out.println(library3);


        System.out.println("\n------>Structural design patterns<------");
        System.out.println("=======Adapter design pattern=======");
        SamsungMobile samsungMobile = new SamsungMobile();
        //You don't have implementation of charger, or you don't have samsung charger.
        Charger charger = new ChargerAdapter();//Now you can charge your samsung phone with nokia charger
        samsungMobile.setCharger(charger);
        samsungMobile.charge();
        //Using my example
        MobileCType mobileCType = new MobileCType();
        mobileCType.setCharge(new ChargerAdapterForCFromB());
        mobileCType.getCharge().charge();
        System.out.println("=======Composite design pattern=======");
        Component ram = new LeafNode("RAM", 1500);
        Component hdd = new LeafNode("HDD", 1000);
        Component cpu = new LeafNode("CPU", 9000);
        Component monitor = new LeafNode("MONITOR", 12000);
        Component mouse = new LeafNode("MOUSE", 500);
        Component printer = new LeafNode("PRINTER", 6000);
        CompositeNode motherBoard = new CompositeNode("MOTHERBOARD");
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        CompositeNode cabinet = new CompositeNode("CABINET");
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);
        CompositeNode peripheral = new CompositeNode("PERIPHERAL");
        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        peripheral.addComponent(printer);
        CompositeNode computer = new CompositeNode("COMPUTER");
        computer.addComponent(cabinet);
        computer.addComponent(peripheral);
        computer.showPrices();


        System.out.println("\n------>Behavioral design patterns<-----");
        System.out.println("=======observer design pattern=======");
        Object subscriber1 = new Subscriber("Ramesh");
        Object subscriber2 = new Subscriber("Brijesh");
        Object subscriber3 = new Subscriber("Deepak");
        Subject subject = new Channel("deepakjnv880");
        subject.subscribe(subscriber1);
        subject.subscribe(subscriber2);
        subject.subscribe(subscriber3);
        subject.upload("How to learn deep learning???");
        subject.unsubscribe(subscriber3);
        subject.upload("How to subscriber a channel :) ");


        System.out.println("\n*****************************************************************");
    }
}