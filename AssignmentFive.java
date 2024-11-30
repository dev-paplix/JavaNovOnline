import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] vipCars = new String[5][4];
        String[][] cheapCars = new String[5][4];
        int vipIndex = 0;
        int cheapIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price of car " + (i + 1) + ": ");
            int price = scanner.nextInt();

            if (price > 70000) {
                if (vipIndex < vipCars.length) {
                    vipCars[vipIndex][0] = String.valueOf(price);
                    vipCars[vipIndex][1] = "VIP";
                    vipCars[vipIndex][2] = "2024";
                    vipCars[vipIndex][3] = "pre-order";
                    vipIndex++;
                }
            } else {
                if (cheapIndex < cheapCars.length) {
                    cheapCars[cheapIndex][0] = String.valueOf(price);
                    cheapCars[cheapIndex][1] = "Cheap";
                    cheapCars[cheapIndex][2] = "old";
                    cheapCars[cheapIndex][3] = "for sale";
                    cheapIndex++;
                }
            }
        }


        System.out.println("VIP Cars:");
        for (String[] row : vipCars) {
            if (row[0] != null) {
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }


        System.out.println("Cheap Cars:");
        boolean hasCheapCars = false;
        for (String[] row : cheapCars) {
            if (row[0] != null) {
                hasCheapCars = true;
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
        if (!hasCheapCars) {
            System.out.println("No cheap cars available.");
        }

        scanner.close();
    }
}