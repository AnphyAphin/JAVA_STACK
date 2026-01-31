import java.util.Scanner;

public class Practical3_qn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double score;
        double totalScore = 0.0;
        int count = 0;

        System.out.println("Enter student names and scores ( type black name + score 999 to stop): ");

        while (true) {
            System.out.println("Enter student name:");
            name = scanner.nextLine();

            System.out.println("Enter student score:");
            score = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if(name.isEmpty() && score == 999) {
                break;
            }

            if(score<0 || score>100) {
                System.out.println("Invalid score, please enter a score between 0 and 100.");
                continue;
            }

            System.out.println("Student Name: " + name + ", Score: " + score);

            totalScore += score;
            count++;
        }
        if(count > 0) {
            double averageScore = totalScore / count;
            System.out.println("Average Score: " + averageScore);
        } else {
            System.out.println("No valid scores were entered.");
        }
        
        scanner.close();
    }
}
