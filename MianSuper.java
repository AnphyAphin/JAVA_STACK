 class Animal1 {
    String name;

    // Superclass contractor
    Animal1(String name){
        this.name=name;
        System.out.println("The super costructor to call "+ name);
    }
}

 class Dog1 extends Animal1 {
     String breed;

    //  Sub constructor calling super constructor
    Dog1(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println(name+" was the name and it's breed "+ breed);
    }
}


public class MianSuper {
    public static void main(String[] args) {
        Animal1 animal= new Animal1("Big D");
        Dog1 d =new Dog1("Big D", "artificial");
    }
}
