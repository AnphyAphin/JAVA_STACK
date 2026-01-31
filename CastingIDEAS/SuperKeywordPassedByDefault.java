class Animal {
    Animal() {
        System.out.println("Animal constructor called (Parent)");
    }
}

class Dog extends Animal {
    Dog() {
        // Even without 'super()', the compiler adds it implicitly here
        System.out.println("Dog constructor called (Subclass)");
    }
}

public class SuperKeywordPassedByDefault {
    public static void main(String[] args) {
        // Creating a Dog object triggers the parent constructor first
        Dog myDog = new Dog();
        // Animal constructor called (Parent)
        // Dog constructor called (Subclass)

    }
}