public class J02_Passing_Arrays {

    public static void update(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] = 100;
        }
    }

    public static void main(String args[]) {

        int num[] = { 32, 64, 86 };

        update(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            // Array values are changed because of pass-by-reference
        }
    }
}

// Arrays are always "pass by reference" in java