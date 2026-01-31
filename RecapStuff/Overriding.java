public class Overriding {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Overriding {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound(); // Outputs: Meow
    }
}