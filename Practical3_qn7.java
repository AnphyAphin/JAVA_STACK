import java.util.Scanner;

public class Practical3_qn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.println("Enter 20 integers:");

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Print integers by normal for loop:");
        for(int i=0; i<numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("Print integers by enhanced for loop:");
        for(int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
    }
}