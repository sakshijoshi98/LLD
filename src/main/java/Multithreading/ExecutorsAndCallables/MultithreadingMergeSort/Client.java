package Multithreading.ExecutorsAndCallables.MultithreadingMergeSort;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        // input array to sort
        int[] input = {4,2,1,8,65,9,0,64};

        // Create a thread pool with a fixed number of threads
        // This thread pool will be reused by all subtasks
        ExecutorService executor = Executors.newCachedThreadPool();
        // ExecutorService executor = Executors.newFixedThreadPool(5);

        try {
            // Create the top-level merge sorter task with the input array
            MergeSorter sorter = new MergeSorter(input, executor);

            // Submit the sorting task to the executor
            Future<int[]> resultFuture = executor.submit(sorter);

            // Get the sorted array once all tasks are done
            int[] sortedArray = resultFuture.get();

            // Print the sorted array
            System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        } finally {
            // Always shut down the executor after use
            executor.shutdown();
        }

    }
}
