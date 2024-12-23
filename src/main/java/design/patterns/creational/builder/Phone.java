package design.patterns.creational.builder;

public class Phone {
    String company;
    String os;
    int memory;
    int ram;
    int battery;
    int camera;

    public Phone(String company, String os, int memory, int ram, int battery, int camera) {
        this.company = company;
        this.os = os;
        this.memory = memory;
        this.ram = ram;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", ram=" + ram +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
