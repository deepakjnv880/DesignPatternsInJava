package design.patterns.creational.Decorator;

public class VegBiryani extends Biryani {
    public VegBiryani() {
        biryaniName = "VegBiryani";
    }


    @Override
    int getBiryaniPrice() {
        return 100;
    }
}
