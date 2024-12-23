package design.patterns.structural.Decorator;

public class Lassi extends ExtraDecorator {
    Biryani biryani;

    public Lassi(Biryani biryani) {
        this.biryani = biryani;
    }

    @Override
    int getBiryaniPrice() {
        return biryani.getBiryaniPrice() + 50;
    }

    @Override
    String getBiryaniName() {
        return biryani.getBiryaniName() + " with Lassi ";
    }
}
