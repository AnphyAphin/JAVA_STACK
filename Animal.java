public class Animal {

    String name;
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="Buddy";
        dog.eat();
        dog.bark();
        System.out.println(dog.name);
    }
}