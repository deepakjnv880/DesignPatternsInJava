package design.patterns.structural.Decorator;

public abstract class Biryani {
    String biryaniName = "";

    String getBiryaniName() {
        return biryaniName;
    }

    abstract int getBiryaniPrice();
}
