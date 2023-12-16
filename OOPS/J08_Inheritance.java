package OOPS;

public class J08_Inheritance {
    public static void main(String[] args) {

        GTA6 me = new GTA6();

        me.car();
        me.npc();
        me.dynamic_wether();
    }
}

// Inheritance is when properties & methods of base class are passed on to a derived class.

class GTA5 {
    void car() {
        System.out.println("This is a Car!");
    }

    void npc() {
        System.out.println("This is NPC!");
    }
}

class GTA6 extends GTA5 {
    void dynamic_wether() {
        System.out.println("This is Dyanmic Wether!");
    }
}   