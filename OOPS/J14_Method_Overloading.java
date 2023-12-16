package OOPS;

public class J14_Method_Overloading {
    public static void main(String[] args) {
        
        Addition A = new Addition();

        System.out.println(A.sum(2, 2));
        System.out.println(A.sum(2, 2, 2));
    }
}

// Multiple functions with the same name but different parameters

class Addition {
    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}