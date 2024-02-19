package design.patterns.creational.Decorator;

public abstract class Biryani {
    String biryaniName = "";

    String getBiryaniName() {
        return biryaniName;
    }

    abstract int getBiryaniPrice();
}
