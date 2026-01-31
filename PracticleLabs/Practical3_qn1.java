import java.util.Scanner;

public class Practical3_qn1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=scanner.nextInt();
        
        if(marks>0 && marks<=100){
            if(marks>=0 && marks<40){
                System.out.println("Grade C");
            } else if(marks>=40 && marks<70){
                System.out.println("Grade B");
            } else {
                System.out.println("Grade A");
            } 
            }
       scanner.close(); 
    }
}

