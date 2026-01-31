import java.util.Scanner;

public class Practical3_qn8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][4];

        System.out.println("Enter 12 integers to fill a 3x4 array: ");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Print the 3x4 array using normal for loop:");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Print the 3x4 array using enhanced for loop:");
        for(int[] row : array) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
