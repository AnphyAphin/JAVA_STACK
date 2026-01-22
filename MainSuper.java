class Animal1 {
    String name;

    Animal1(String name) {
        this.name = name;
        System.out.println("Superclass constructor called with name: " + name);
    }
}

class Dog1 extends Animal1 {
    String breed;

    Dog1(String name, String breed) {
        super(name); // must be first statement
        this.breed = breed;
        System.out.println(name + " has breed: " + breed);
    }
}

public class MainSuper {
    public static void main(String[] args) {
        Animal1 animal = new Animal1("Big D");
        Dog1 d = new Dog1("Big D", "Artificial");

        System.out.println(animal);
        System.out.println("d.name: " + d.name);
        System.out.println("d.breed: " + d.breed);
    }
}
