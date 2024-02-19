package design.patterns.structural.adapter.myExample;

public class MobileChargerBType implements BTypeCharger{
    @Override
    public void charge() {
        System.out.println("Charging using B type charger.");
    }
}
