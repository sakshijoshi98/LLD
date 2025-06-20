package Multithreading.IntroToThreads;

public class NumberPrinter implements Runnable {
    // A task that prints a number, assigned via constructor
    private final int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // Print number along with the thread's name
        System.out.println("Number: " + number + " printed by " + Thread.currentThread().getName());
    }
}
