package design.patterns.creational.builder;

public class PhoneBuilder {
    String company;
    String os;
    int memory;
    int ram;
    int battery;
    int camera;

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone() {
        return new Phone(company, os, memory, ram, battery, camera);
    }
}
