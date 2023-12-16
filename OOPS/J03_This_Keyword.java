package OOPS;

public class J03_This_Keyword {
    public static void main(String args[]) {

        Name My_Name = new Name();

        My_Name.set_name("Azim");
    }
}

// This keyword is used to refer to the current object

class Name {
    String name;

    void set_name(String name){
        this.name = name;
    }

    String get_name(){
        return this.name;
    }
}