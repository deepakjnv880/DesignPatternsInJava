package design.patterns.creational.factory;

public class WindowOS implements OperatingSystem {

    @Override
    public void show() {
        System.out.println("I am window 10 operating system.");
    }
}
