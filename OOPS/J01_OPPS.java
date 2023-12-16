package OOPS;

public class J01_OPPS {
    public static void main(String args[]) {

        Laptop My_laptop = new Laptop();

        My_laptop.set_info("Lenovo", "Ideapad Gaming 3", "Ryzen 5 5600H", "Nvedia GTX 1650", 8);

        My_laptop.get_info();

        My_laptop.RAM = 16; // Can be changed from here because RAM variablr acess specifier is Deafult now

        System.out.println("\nTHIS IS UPDATED INFROMATION!\n");
        My_laptop.get_info();

    }
}

class Laptop {
    String Brand;
    String Name;
    String CPU;
    String GPU;
    int RAM;

    void set_info(String brand, String name, String cpu, String gpu, int ram) {
        Brand = brand;
        Name = name;
        CPU = cpu;
        GPU = gpu;
        RAM = ram;
    }

    void get_info(){
        System.out.println("Your laptop is: " + Brand + " " + Name);
        System.out.println("CPU: " + CPU);
        System.out.println("GPU: " + GPU);
        System.out.println("RAM: " + RAM);
    }
}