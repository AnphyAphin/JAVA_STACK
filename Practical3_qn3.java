import java.util.Scanner;

class UsingForLoop {
    public static int SolveByFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

class UsingWhileLoop {
    public static int SolveByWhile(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}

class UsingDoWhileLoop {
    public static int SolveByDoWhile(int n) {
        int fact = 1, i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        return fact;
    }
}

public class Practical3_qn3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        System.out.println(UsingForLoop.SolveByFor(number));
        System.out.println(UsingWhileLoop.SolveByWhile(number));
        System.out.println(UsingDoWhileLoop.SolveByDoWhile(number));
        scanner.close();
    }
}
