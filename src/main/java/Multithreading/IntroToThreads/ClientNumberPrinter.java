package Multithreading.IntroToThreads;

public class ClientNumberPrinter {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            Runnable task = new NumberPrinter(i);

            Thread thread = new Thread(task);

            thread.start();

        }
        System.out.println("Main ends : " + Thread.currentThread().getName());
    }
}
