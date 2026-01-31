// Abstract Class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method (standard functionality)
    void sleep() {
        System.out.println("Zzz...");
    }
}

// Subclass providing specific implementation
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Reference of type Animal
        myDog.makeSound();        // Output: Woof!
        myDog.sleep();            // Output: Zzz...
    }
}
