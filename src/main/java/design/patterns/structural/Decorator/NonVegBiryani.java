package design.patterns.structural.Decorator;

public class NonVegBiryani extends Biryani {
    public NonVegBiryani() {
        biryaniName = "NonVegBiryani";
    }

    @Override
    int getBiryaniPrice() {
        return 150;
    }
}
