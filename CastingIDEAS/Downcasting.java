class Mobile {
    String deptName = "General Electronics";

    Mobile() {
        System.out.println("Mobile Constructor Running");
    }

    // New: Method to be overridden for polymorphic access
    void showDetails() {
        System.out.println("Department: " + deptName);
    }
}

class Phone extends Mobile {
    String modelName;

    Phone(String model) {
        super(); // Calls parent constructor
        this.modelName = model;
        System.out.println("Phone Constructor Running");
    }

    @Override
    void showDetails() {
        // Accessing both parent and subclass fields
        System.out.println("Department: " + deptName + " | Model: " + modelName);
    }
}

public class Downcasting {
    public static void main(String[] args) {
        // Upcasting: Parent reference 'myDevice' points to a 'Phone' object
        Mobile myDevice = new Phone("Galaxy S21");

        // 1. Accessing parent field directly (Standard)
        System.out.println("Accessing field: " + myDevice.deptName);

        // 2. Accessing subclass data via Polymorphism (Best Practice)
        // Even though reference is 'Mobile', it calls Phone's showDetails()
        myDevice.showDetails(); 

        // 3. Accessing subclass field via Downcasting (Explicit)
        if (myDevice instanceof Phone) {
            Phone myPhone = (Phone) myDevice;
            System.out.println("Downcasted access: " + myPhone.modelName);
        }
    }
}
