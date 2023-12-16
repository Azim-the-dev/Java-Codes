package Temp;

public class J09_5 {
    public static void main(String args[]) {
        String Azim = "MOM";
        String Azzim = "";
        char ch;

        for (int i = 0; i < Azim.length(); i++) {
            ch = Azim.charAt(i);
            Azzim = ch + Azzim;
        }

        System.out.println(Azzim);

        boolean bool = true;

        // This is my won 'str.equals(str2)' 
        for (int i = 0; i < Azim.length(); i++) {
            if (Azim.charAt(i) == Azzim.charAt(i)) {
                bool = true;
            }else{
                bool = false;
            }
        }

        if (bool == true) {
            System.out.println("PALANDROME");
        } else {
            System.out.println("NOT PALANDROME");
        }
    }
}