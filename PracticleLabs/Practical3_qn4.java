import java.util.Scanner;

public class Practical3_qn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter purchasing amount: ");
        double salingAmount = scanner.nextDouble();

        System.out.println("Enter the tax-code(0,1,2,3):");
        int taxCode = scanner.nextInt();

        double taxAmount = 0;
        switch (taxCode) {
            case 0:
                taxAmount=0;
                break;
            case 1:
                taxAmount=salingAmount*0.05;
                break;
            case 2:
                taxAmount=salingAmount*0.07;
                break;
            case 3:
                taxAmount=salingAmount*0.1;
                break;

            default:
                break;
        }

        double totalAmount = salingAmount + taxAmount;

        System.out.println("Name: " + name);
        System.out.println("Purchasing Amount: " + salingAmount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Total Amount: " + totalAmount);

        scanner.close();
    }
}
