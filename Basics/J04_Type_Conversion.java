package Basics;

public class J04_Type_Conversion {
    public static void main(String args[]) {
        int a = 20;
        long b = a;
        System.out.println(b);
        // int[4 byte] >> long [8 byte] (POSSIBLE)

        // double a = 20;
        // int b = a;
        // System.out.println(b);
        // Not work due to Type Conversion
        // double [8 byte] >> int[4 byte] (NOT POSSIBLE)
    }
}

/*
 * Type Conversion happens when:
 * a. type compatible
 * b. destination > source type
 * 
 * [byte -> short -> int -> float -> long -> double]
 * 
 */