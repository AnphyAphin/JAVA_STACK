public class NestedLoopDemo {
    public static void main(String[] args) {
        // Create a 3x3 zero array; Because Java automatically initializes all int array elements to 0 by default
        int[][] arr = new int[3][3];

        // Nested loop to print array rows
        for (int i = 0; i < arr.length; i++) {
            // Print each element in the row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            // After printing row, print ". " and row number
            System.out.println(". " + (i + 1));
        }
    }
}
