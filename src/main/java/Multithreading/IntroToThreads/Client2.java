package Multithreading.IntroToThreads;

public class Client2 {
    public static void main(String[] args) {

        HelloPrinter printer = new HelloPrinter();

        // This will run the task in a new thread
        Thread thread = new Thread(printer);

        // Executes run() in a separate thread
        thread.start();

        // This will run the task in the main thread (NOT multithreading)
        printer.run(); // Executes run() in the current (main) thread

        System.out.println("Main thread ends : " + Thread.currentThread().getName());
    }
}
