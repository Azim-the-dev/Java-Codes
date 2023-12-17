package Exception;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class thread {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThread myThread = new MyThread();

        // Starting the thread using the start() method
        myThread.start();

        // Getting the thread's name using getName() method
        System.out.println("Thread name: " + myThread.getName());

        // Setting the thread's name using setName() method
        myThread.setName("MyCustomThread");

        // Getting the updated thread name
        System.out.println("Updated Thread name: " + myThread.getName());

        // Checking if the thread is alive using isAlive() method
        System.out.println("Is thread alive? " + myThread.isAlive());

        try {
            // Making the main thread sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checking if the thread is alive after sleep
        System.out.println("Is thread still alive? " + myThread.isAlive());
    }
}
