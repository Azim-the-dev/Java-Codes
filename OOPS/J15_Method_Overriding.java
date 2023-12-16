package OOPS;

public class J15_Method_Overriding {
    public static void main(String[] args) {

        Derived A = new Derived();
        A.nothing();
    }
}

// Parent and child classes both contain the same function with a different definition.

class Base {
    void nothing() {
        System.out.println("Nothing1...");
    }
}

class Derived extends Base {
    void nothing() {
        System.out.println("Nothing2...");
    }
}