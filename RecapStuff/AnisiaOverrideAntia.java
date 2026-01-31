class Antia {
    void makeSound(){
        System.out.println("antia wow");
    }
}

class Anisia extends Antia {
   
    // @Override
    void makeSound() {
       System.out.println("anisia wow");
    }
}

public class AnisiaOverrideAntia {

    public static void main(String[] args) {
        Anisia anisia = new Anisia();
        anisia.makeSound();

        Antia antia = new Antia();
        antia.makeSound();
    }
}