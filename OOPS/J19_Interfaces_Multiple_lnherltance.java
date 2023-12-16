package OOPS;

public class J19_Interfaces_Multiple_lnherltance {
    public static void main(String[] args) {
        
        Derived D1 = new Derived();

        D1.set_num1(5);
        D1.set_num2(5);
        D1.get_nums();
    }
}

// This is a example of implementing Multiple lnherltance using Interfaces

// Multiple Inheritance:

// [Base1]--->
//             >----[Derived]
// [Base2]--->

interface Base1 {
    void set_num1(int num1);
}

interface Base2 {
    void set_num2(int num2);
}

class Derived implements Base1,Base2 {
    int num1;
    int num2;

    public void set_num1(int num1){
        this.num1 = num1;
    }

    public void set_num2(int num2){
        this.num2 = num2;
    }

    public void get_nums(){
        System.out.println("Num1: " + num1 + "\n" + "Num2: " + num2);
    }
}