import java.util.Scanner;

public class TryCatchMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Enter values for a 3x4 matrix");
        System.out.println("2. Enter values for a 2x3 matrix");
        int choice = scanner.nextInt();

        int[][] matrix = null;

        try {
            if (choice == 1) {
                matrix = new int[3][4];
                System.out.println("Enter 12 values for the 3x4 matrix:");
            } else if (choice == 2) {
                matrix = new int[2][3];
                System.out.println("Enter 12 values for the 2x3 matrix:");
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Matrix values:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: You entered more values than the matrix can hold.");
        } finally {
            scanner.close();
        }
    }
}