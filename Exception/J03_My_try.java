// This program is about check a number is negtive or not using Exception

package Exception;
import java.util.*;

class NegativeNum extends Exception {
    NegativeNum(String msg) {
        System.out.println(msg);
    }
}

public class J03_My_try {

    public static void check(int num) throws NegativeNum {
        if (num < 0) {
            throw new NegativeNum("Entered number is negative number");
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        try {
            check(num);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("The number is: " + num);
    }
}