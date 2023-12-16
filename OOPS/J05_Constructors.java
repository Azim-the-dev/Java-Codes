package OOPS;

public class J05_Constructors {
    public static void main(String[] args) {

        // Non-parameterized Constructor
        My_Class obj1 = new My_Class();
        obj1.get_data();

        // Parameterized Constructor
        My_Class obj2 = new My_Class("Azim");
        obj2.get_data();


        My_Class obj3 = new My_Class(2077);
        obj3.get_data();
    }
}

// Constructor is a special method which is invoked automatically at the time of object creation.

// - Constructors have the same name as class or structure.
// - Constructors don't have a return type. (Not even void)
// - Constructors are only called once, at object creation.
// - Memory allocation happens when constructor is called.

class My_Class {
    String name;
    int num;

    // Non-parameterized
    My_Class() { // You have to make a deafult parameterized while overloading
        System.out.println("Constructors is called!");
    }

    // Parameterized
    My_Class(String name) {
        this.name = name;
    }

    My_Class(int num) {
        this.num = num;
    }

    void get_data() {
        System.out.println("\nName: " + name);
        System.out.println("Num: " + num + "\n");
    }
}

// In this program i have overloaded Constructor too