package design.patterns.structural.adapter;

public class SamsungMobile {
    Charger charger;

    public void charge() {
        charger.charge();
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }
}
