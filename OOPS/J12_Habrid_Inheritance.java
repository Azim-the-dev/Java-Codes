package OOPS;

class J12_Habrid_Inheritance {
    public static void main(String[] args) {
        
        Derived1 A1 = new Derived1();
        A1.show_num();

        Derived2 A2 = new Derived2();
        A2.show_num();

        Derived3 A3 = new Derived3();
        A3.show_num();
    }
}

// Habrid Inheritance

//            >---[Derived1] >---[Derived3]
// [Base]--->
//            >---[Derived2]

class Base {
    int num = 4;

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

class Derived3 extends Derived1 {
    void nothing() {
        System.out.println("Hi i'm Nothing...");
    }
}