package Multithreading.IntroToThreads;

public class HelloPrinter implements Runnable {

    // A simple class that implements Runnable to define a task
    public void print(){
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run(){
        print();
    }
}
