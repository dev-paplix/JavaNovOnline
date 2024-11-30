import java.util.Scanner;

public class AssignmentSecondSecond {

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
        AssignmentSecondSecond assignment = new AssignmentSecondSecond();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        String result = (averagePrice > 100000) ? "expensive" : (averagePrice <= 99999 && averagePrice >= 50000) ? "normal" : (averagePrice < 49999) ? "cheap" : "unknown price range";
        System.out.println("The average price of the cars is: " + averagePrice + " which is " + result);
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
