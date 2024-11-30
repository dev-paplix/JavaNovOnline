import java.util.Scanner;

public class AssignmentSecond {

    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssignmentSecond assignment = new AssignmentSecond();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        if (averagePrice > 100000) {
            System.out.println("The average price of the cars is: " + averagePrice + " which is expensive");
        } else if (averagePrice <= 99999 && averagePrice >= 50000) {
            System.out.println("The average price of the cars is: " + averagePrice + " which is normal");
        } else if (averagePrice < 49999) {
            System.out.println("The average price of the cars is: " + averagePrice + " which is cheap");
        } else {
            System.out.println("The average price of the cars is: " + averagePrice + " unknown price range");
        }
    }

    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return new Car(model, make, price);
    }
}
