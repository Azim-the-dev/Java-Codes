class Invalid_Age_Ex extends Exception {
    Invalid_Age_Ex(String s) {
        System.out.println(s);
    }
}

public class J09_User_define {

    public static void vote(int age) throws Invalid_Age_Ex {
        if (age < 18) {
            throw new Invalid_Age_Ex("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            vote(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}