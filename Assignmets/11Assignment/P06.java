abstract class Appliance {
    String name; int power;
    Appliance(String n, int p) { name = n; power = p; }
    abstract void turnOn();
    abstract void turnOff();
    void showStatus() { System.out.println(name + " uses " + power + "W"); }
}

interface SmartDevice {
    void connectWifi();
}

class Fan extends Appliance { ... }
class Light extends Appliance implements SmartDevice { ... }
class WashingMachine extends Appliance implements SmartDevice { ... }
