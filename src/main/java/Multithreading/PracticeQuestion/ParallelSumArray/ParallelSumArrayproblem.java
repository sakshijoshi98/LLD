package Multithreading.PracticeQuestion.ParallelSumArray;

// Assignment: Parallel Sum with Callable and Future
//You are given the file ParallelArraySumClient.java, which:
//Creates a 1 million element array.
//Divides it into N chunks (N = number of available CPU cores).
//Submits each chunk to a thread pool for parallel sum.

//Your Task:
//Implement SumTask.java such that:
//It implements Callable<Long>.
//The constructor takes int[] array, int start, and int end.
//The call() method returns the sum of the elements in the chunk [start, end).


import java.util.*;
import java.util.concurrent.*;

public class ParallelSumArrayproblem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Step 1: Generate an array of 1 million random integers
        int size = 1_000_000;
        int[] array = new Random().ints(size, 1, 100).toArray();

        // Step 2: Get the number of available processors
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);

        // Step 3: Create ExecutorService with the number of available cores
        // TODO:
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        List<Long> chunkSum = new ArrayList<>();

        // Step 4: Divide array into chunks and create tasks
        int chunkSize = size / cores;
        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : start + chunkSize;

            // TODO: Create SumTask instance and submit it to the executor
            SumTask task = new SumTask(array, start, end);
            Future<Long> future = executor.submit(task);
            chunkSum.add(future.get());
        }

        // Step 5: Collect results from all chunks
        long totalSum = 0;
        // TODO:
        for(Long future : chunkSum){
            totalSum += future;
        }



        // Step 6: Print final result
        System.out.println("Final sum = " + totalSum);

        // Step 7: Shutdown executor
        executor.shutdown();

    }
}
