package java.factory;

abstract class Vehicle {
    public abstract int getWheelCount();

    public String toString() {
        return "Wheel count:" + this.getWheelCount();
    }
}

class Car extends Vehicle {
    Car() {
    }

    @Override
    public int getWheelCount() {
        return 4;
    }
}

class Bike extends Vehicle {
    Bike() {
    }

    @Override
    public int getWheelCount() {
        return 4;
    }
}

class Factory {
    public static Vehicle getVehicle(String type) {
        if (type == "Car") {
            return new Car();
        }
        if (type == "Bike") {
            return new Bike();
        }
        return null;
    }
}

public class VehicleFactory {
    public static void main(String[] args) {
        Vehicle car = Factory.getVehicle("Car");
        System.out.println(car);
    }
}
