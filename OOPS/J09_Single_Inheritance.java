package OOPS;

public class J09_Single_Inheritance {
    public static void main(String[] args) {

        Derived D = new Derived();
        D.show_num();
    }

}

// Single Inheritance

// [ Base ---> Derived ]

class Base {
    int num = 1;

    void show_num() {
        System.out.println("num: " + num);
    }
}

class Derived extends Base {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}