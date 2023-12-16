package OOPS;

public class J17_Abstract_Class {
    public static void main(String[] args) {
        Dog name = new Dog();
        name.walk();

        Chicken no_name = new Chicken();
        no_name.walk();

        // Animal A = new Animal();
        // Cannot create create abstract class object
    }
}

// - Cannot create create an instance of abstract class
// - Can have abstractlnon-abstract methods
// - Can have constructors

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called...");
        color = "Black";
    }

    void eat() {
        System.out.println("Animal eats!");
    }

    abstract void walk(); // Idea
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor called...");
    }

    void change_color() {
        color = "Brown";
    }

    void walk() {
        System.out.println("i watks on 4 legs");
    }
}

class Chicken extends Animal {

    void change_color() {
        color = "White";
    }

    void walk() {
        System.out.println("i watks on 2 legs");
    }
}