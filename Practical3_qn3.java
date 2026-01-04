import java.util.*;

public class Practical3_qn3 {
    public static int SolveByFor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int SolveByWhile(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static int SolveByDoWhile(int n) {
        int fact = 1, i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        System.out.println(SolveByFor(number));
        System.out.println(SolveByWhile(number));
        System.out.println(SolveByDoWhile(number));
    }
}
