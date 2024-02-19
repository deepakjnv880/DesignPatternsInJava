package design.patterns.creational.Decorator;

public class WaterBottle extends ExtraDecorator {
    Biryani biryani;

    public WaterBottle(Biryani biryani) {
        this.biryani = biryani;
    }

    @Override
    int getBiryaniPrice() {
        return biryani.getBiryaniPrice() + 20;
    }

    @Override
    String getBiryaniName() {
        return biryani.getBiryaniName() + " with Water Bottle ";
    }
}
