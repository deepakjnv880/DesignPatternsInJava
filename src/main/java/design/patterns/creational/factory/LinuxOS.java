package design.patterns.creational.factory;

public class LinuxOS implements OperatingSystem {

    @Override
    public void show() {
        System.out.println("I am linux operating system.");
    }
}
