    package OOPS;

    public class J06_Copy_Constructors {
        public static void main(String atgs[]){

            Me Azim = new Me("Azim");

            Azim.get_name();

            Me Azim2 = new Me(Azim);

            Azim2.get_name();
        }
    }


    class Me {
        String name;

        Me(String name){
            this.name = name;
        }

        Me(Me Azim){
            this.name = Azim.name;
        }

        void get_name(){
            System.out.println("Name is: " + name);
        }
    }