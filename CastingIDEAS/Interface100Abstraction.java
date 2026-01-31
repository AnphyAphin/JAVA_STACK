interface Animals {
    void makeSound();
    void sleep();    
}

class Pigs implements Animals {
    public void makeSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

public class Interface100Abstraction {

   public static void main(String[] args) {
        Pigs myPig = new Pigs(); 
        myPig.makeSound();
        myPig.sleep();
    }  
}
