package design.patterns.structural.adapter.myExample;

/**
 * Adapter charging C type phone from B type charger
 */
public class ChargerAdapterForCFromB implements CTypeCharger {
    BTypeCharger charger = new MobileChargerBType();

    @Override
    public void charge() {
        System.out.print("I am charger adapter for c type phone and ");
        charger.charge();
    }
}
