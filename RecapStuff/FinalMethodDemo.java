class Vehicle {
    // final method cannot be overridden
    public final void startEngine() {
        System.out.println("Engine started safely.");
    }

    public void fuelType() {
        System.out.println("Generic fuel.");
    }
}

class Car extends Vehicle {

    @Override
    public void fuelType() {
        System.out.println("Petrol or Diesel.");
    }
}

public class FinalMethodDemo {
   
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  
        myCar.fuelType();     
    }

}
