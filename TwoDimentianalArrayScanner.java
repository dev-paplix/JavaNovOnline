import java.util.Scanner;

public class TwoDimentianalArrayScanner {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][4];

        System.out.println("Enter values for a 3x4 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");
        scanner.close();
    }
}