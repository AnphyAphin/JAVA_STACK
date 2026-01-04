import java.util.Scanner;

public class Practical3_qn5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 temperatures in Fahrenheit:");
        for(int i=1; i<=15; i++){
            double temperatureF=scanner.nextDouble();
            double temperatureC=(5.0/9.0)*(temperatureF-32);
            System.out.println(temperatureC);
        }
        scanner.close();
    }
}
