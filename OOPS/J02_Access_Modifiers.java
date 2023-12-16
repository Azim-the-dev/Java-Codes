package OOPS;

public class J02_Access_Modifiers {
    public static void main(String args[]){

        Bank_Account Azim = new Bank_Account();
        
        Azim.UserName = "SK AZIM";

        Azim.set_password(9743997);
        Azim.show_data();
    }
}

class Bank_Account{
    public String UserName;
    private int Password;

    void set_password(int pas){
        Password = pas;
    }

    void show_data(){
        System.out.println("UserName: " + UserName);
        System.out.println("Password: " + Password);
    }
}

// By Default Access Modifier is 'Default' in Java

// Access Modifier    Within Class    Within Package    Outside Package By Subclass Only    Outside Package
//    Private              Y                N                           N                          N
//    Default              Y                Y                           N                          N
//    Protected            Y                Y                           Y                          N
//    Public               Y                Y                           Y                          Y