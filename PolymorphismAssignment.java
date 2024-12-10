import java.util.Scanner;


class Car {
    public void price() {
        System.out.println("Car price is not available");
    }
}

class Toyota extends Car {
    @Override
    public void price() {
        System.out.println("25,000RM");
    }
}

class BMW extends Car {
    @Override
    public void price() {
        System.out.println("85,000RM");
    }
}

class Tesla extends Car {
    @Override
    public void price() {
        System.out.println("75,000RM");
    }
}

public class PolymorphismAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car name: ");
        String carName = scanner.nextLine();
        Car car;

        switch (carName) {
            case "Toyota":
                car = new Toyota();
                break;
            case "BMW":
                car = new BMW();
                break;
            case "Tesla":
                car = new Tesla();
                break;
            default:
                car = new Car();
                break;
        }

        car.price();
        scanner.close();
    }
}