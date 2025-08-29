
interface Chargeable {
    void chargeBattery();
}

abstract class Vehicle {
    protected String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public abstract void start();
    public abstract void stop();

    public void displayInfo() {
        System.out.println("Vehicle Registration: " + registrationNumber);
    }
}


class Car extends Vehicle {
    public Car(String registrationNumber) {
        super(registrationNumber);
    }
    public void start(){
        System.out.println("Car " + registrationNumber + " starting with petrol engine...");
    }

 
    public void stop() {
        System.out.println("Car " + registrationNumber + " stopped.");
    }
}


class Truck extends Vehicle {
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }

  
    public void start() {
        System.out.println("Truck " + registrationNumber + " starting with diesel engine...");
    }

  
    public void stop() {
        System.out.println("Truck " + registrationNumber + " stopped.");
    }
}


class ElectricBike extends Vehicle implements Chargeable {
    public ElectricBike(String registrationNumber) {
        super(registrationNumber);
    }

  
    public void start() {
        System.out.println("Electric Bike " + registrationNumber + " starting silently...");
    }

  
    public void stop() {
        System.out.println("Electric Bike " + registrationNumber + " stopped.");
    }

  
    public void chargeBattery() {
        System.out.println("Electric Bike " + registrationNumber + " battery charging...");
    }
}


class ElectricCar extends Vehicle implements Chargeable {
    public ElectricCar(String registrationNumber) {
        super(registrationNumber);
    }

  
    public void start() {
        System.out.println("Electric Car " + registrationNumber + " starting silently...");
    }

  
    public void stop() {
        System.out.println("Electric Car " + registrationNumber + " stopped.");
    }

  
    public void chargeBattery() {
        System.out.println("Electric Car " + registrationNumber + " battery charging...");
    }

}


 class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("KA01AB1234");
        Vehicle truck = new Truck("KA02XY9876");
        ElectricBike ebike = new ElectricBike("KA03EL5678");
        ElectricCar ecar = new ElectricCar("KA04EV4321");

        car.start();
        car.stop();

        truck.start();
        truck.stop();

        ebike.start();
        ebike.chargeBattery();
        ebike.stop();

        ecar.start();
        ecar.chargeBattery();
        ecar.stop();
    }
}
