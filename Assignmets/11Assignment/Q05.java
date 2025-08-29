abstract class Appliance {
    String name; int power;
    abstract void turnOn();
    abstract void turnOff();
    void showStatus() {
        
     }
}

interface SmartDevice { void connectWifi(); }

class Fan extends Appliance { 
  }
class Light extends Appliance implements SmartDevice {
      }
class WashingMachine extends Appliance implements SmartDevice { 

}
