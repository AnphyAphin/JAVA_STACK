// import java.lang.reflect.Type;

abstract class Mobile{
    String name;

    Mobile(String name){
        this.name = name;
    }

    // The abstract method ("no body")
    abstract void displayScreen();

    // Declares a concrete method with body
    void functionality(){
        System.out.println(name+" should be advanced");
    }
}

class Phone extends Mobile{
    String TypeV;

    Phone(String name, String TypeV){
        super(name);
        this.TypeV=TypeV;
    }

    @Override
    void displayScreen(){
        System.out.println("Small size");

    }

    void functionality(){
        System.out.println(name+ " better simplified "+TypeV);
    }
}

 class Computer extends Mobile {
    String TypeV;

    Computer (String name, String TypeV){
        super(name);
        this.TypeV=TypeV;
    }
    
    @Override
     void displayScreen(){
        System.out.println("Large size");

    }

    void functionality(){
        System.out.println(name+ " more complex "+TypeV);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // The performed code implementation below on abstract class is not allowed
    //   Mobile mobile = new Mobile("MAC");
    //   mobile.functionality();  

      Phone phone = new Phone("iPhone 17", "Pro.2026");
      phone.displayScreen();
      phone.functionality();

      Computer computer = new Computer("AllInOne", "MAC.2026");
      computer.displayScreen();
      computer.functionality();
    }
}
