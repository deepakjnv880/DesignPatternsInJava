package design.patterns.creational.factory;

public class OperatingSystemFactory {
    public OperatingSystem getOperatingSystem(String os) {
        switch (os) {
            case "linux":
                return new WindowOS();
            case "mac":
                return new MacOS();
            case "window":
                return new LinuxOS();
            default:
                System.out.println("Error: There is os operating system like <" + os + "> exists.");
                return null;
        }
    }
}
