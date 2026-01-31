import java.util.Scanner;

public class Practical3_qn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: (A, B, C)");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Grade A");
                break;
            case 'B':
                System.out.println("Grade B");
                break;
            case 'C':
                System.out.println("Grade C");
                break;
                default:
                System.out.println("Invalid grade");
        }
        
        scanner.close();
    }
}
