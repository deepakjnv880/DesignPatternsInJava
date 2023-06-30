package design.patterns.structural.adapter;

public class ChargerAdapter implements Charger {
    NokiaCharger nokiaCharge = new NokiaCharger();

    @Override
    public void charge() {
        nokiaCharge.doCharge();
    }
}
