package OOPS;

public class J10_Multilevel_Inheritance {
    public static void main(String[] args) {

        Derived1 D1 = new Derived1();
        D1.show_num();

        Derived2 D2 = new Derived2();
        D2.show_num();
    }
}

// Multilevel Inheritance

// [ Base ---> Derived1 ---> Derived2 ]

class Base {
    int num = 2;

    void show_num() {
        System.out.println("num: " + num);
    }
}

class Derived1 extends Base {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}

class Derived2 extends Derived1 {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}