package design.patterns.creational.factory;

public class MacOS implements OperatingSystem {

    @Override
    public void show() {
        System.out.println("I am mac operating system.");
    }

    public int sum(int a, int b){
        return a+b;
    }
}
