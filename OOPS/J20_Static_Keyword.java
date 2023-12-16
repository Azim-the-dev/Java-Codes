package OOPS;

public class J20_Static_Keyword {
    public static void main(String args[]){
        
        Student Azim = new Student();
        Azim.set_name("Azim");
        Azim.set_collage("DRIEMS"); // Ststic
        Azim.show_data();
        
        Student Aryan = new Student();
        Aryan.set_name("Aryan");
        Aryan.show_data();
    }
}

// static keyword in Java is used to share the same variable or method of a given class.

class Student {
    String name;
    static String collage;

    void set_name(String name) {
        this.name = name;
    }

    void set_collage(String collage) {
        Student.collage = collage; // Coz it static i think
    }
    
    void show_data(){
        System.out.println("Name: " + name + "\n" + "Collage: " + collage);
    }
}