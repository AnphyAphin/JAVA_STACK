// Parent class
class Wanyama {

    void makeSound() {
        System.out.println("Roar!!!!");
    }
}

// Child class
class Paka extends Wanyama {

    // Constructor
    

    void eat() {
        System.out.println("Paka anapenda kula samaki");
        super.makeSound();
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating object of child class
        Paka nyau = new Paka();

        // Calling child class method
        nyau.eat();
    }
    ////////////////
} 