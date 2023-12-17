package Exception;

import java.util.*;

public class J04_No_name {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            int num = scn.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        scn.close();

        System.out.println("Ended...");
    }
}
