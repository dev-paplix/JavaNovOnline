// Compile-time Polymorphoisim

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

//Run-time Polymorphism

class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        //Compile-time Polymorphism

        Calculator calc = new Calculator();
        System.out.println("Sum:  " + calc.add(5, 10));
        System.out.println("Sum:  " + calc.add(5.5, 10.5));

        // Run-time Polymorphism

        Animal animal = new Dog();
        animal.sound();
        Animal newanimal  = new Cat();
        newanimal.sound();
        Animal animal1 = new Animal();
        animal1.sound();
    }
    
}
