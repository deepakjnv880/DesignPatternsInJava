package design.patterns.structural.composite;

public class LeafNode implements Component {
    String name;
    int price;

    public LeafNode(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrices() {
        System.out.println("Price of " + name + " is " + price + " rupee.");
    }
}
