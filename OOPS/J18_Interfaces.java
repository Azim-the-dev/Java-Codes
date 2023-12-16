package OOPS;

public class J18_Interfaces {
    public static void main(String[] args) {
        
        Azim me = new Azim();

        me.name();
        me.roll_no();
        me.student_class();
    }
}

// Interface is a blueprint of a class.

// - All methods are public, abstract & without implementation
// - Used to achieve total abstraction
// - Variables in the interface are final, public and static

interface Student {

    void name();

    void roll_no();

    void student_class();
}

class Azim implements Student {
    
    public void name(){
        System.out.println("Sk, Azim");
    }

    public void roll_no(){
        System.out.println("25");
    }

    public void student_class(){
        System.out.println("IDK");
    }
}