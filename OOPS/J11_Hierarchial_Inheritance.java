package OOPS;

public class J11_Hierarchial_Inheritance {
    public static void main(String[] args) {
        
        Derived1 D1 = new Derived1();
        D1.show_num();

        Derived2 D2 = new Derived2();
        D2.show_num();
    }
}

// Hierarchial Inheritance

//            >---[Derived1]
// [Base]--->
//            >---[Derived2]

class Base {
    int num = 3;

    void show_num() {
        System.out.println("num: " + num);
    }
}

class Derived1 extends Base {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}

class Derived2 extends Base {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}