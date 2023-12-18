public class J06_Array_Obj {
    public static void main(String[] args) {

        Person[] obj = new Person[3];

        obj[0] = new Person("Azim", 18);
        obj[1] = new Person("Aziz", 20);
        obj[2] = new Person("Alam", 17);

        for (Person person : obj) { // This is new for loop
            person.display();
            System.out.println();
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}