package OOPS;

public class J21_Super_Keyword {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
        obj.show_num();
    }
}

// super keyword is used to refer immediate parent class object.

// - to access parent's properties
// - to access parent's functions
// - to access parent's constructor

class Parent {
    int num = 10;

    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    int num2 = 20;

    void display() {
        super.display(); // Calling the parent class method
        System.out.println("This is the child class");
    }

    void show_num() {
        System.out.println("Parent Variable: " + super.num); // Accessing parent's variable
    }
}