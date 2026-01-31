interface Vehicle {
    int MAX_SPEED = 120;

    void start();

    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    static void info() {
        System.out.println("Vehicles are used for transportation.");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started. Max speed is " + MAX_SPEED);
    }
}

public class InterfaceFieldDemo {
    public static void main(String[] args) {

        // Interface reference → polymorphism
        Vehicle myVehicle = new Car();

        myVehicle.start();   // Calls Car's implementation
        myVehicle.stop();    // Calls default method

        // Accessing interface constant
        System.out.println("Vehicle max speed: " + Vehicle.MAX_SPEED);

        // Calling static interface method
        Vehicle.info();
    }
}
