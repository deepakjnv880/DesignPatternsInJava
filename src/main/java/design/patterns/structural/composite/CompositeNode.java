package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements Component {
    String name;
    List<Component> nodesItContain = new ArrayList<>();

    public CompositeNode(String name) {
        this.name = name;
    }

    @Override
    public void showPrices() {
        System.out.println("-->" + name);
        for (Component component : nodesItContain) {
            component.showPrices();
        }
    }

    public void addComponent(Component component) {
        nodesItContain.add(component);
    }
}
