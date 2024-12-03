import java.util.Scanner;


public class BMIEncapsulation {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return (height - 100) / weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIEncapsulation person = new BMIEncapsulation();

        System.out.print("Enter name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt());

        System.out.print("Enter height (in cm): ");
        person.setHeight(scanner.nextDouble());

        System.out.print("Enter weight (in kg): ");
        person.setWeight(scanner.nextDouble());

        double bmi = person.calculateBMI();
        System.out.println("The person name is " + person.getName() + " and he/she is " + person.getAge() + " years old and his/her bmi is " + bmi);
    }
}