package Multithreading.ExecutorsAndCallables.MultithreadingMergeSort;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class MergeSorter implements Callable<int[]> {

    private final int[] array;
    public final ExecutorService executor;

    public MergeSorter(int[] array,ExecutorService executor){
        this.array = array;
        this.executor = executor;
    }

    public int[] call() throws Exception {
        // get the current thread's name
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " -sorting" + Arrays.toString(array));

        // base case
        if(array.length <= 1){
            return array;
        }

        // divide the array
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);

        // create the task
        MergeSorter leftTask = new MergeSorter(left,executor);
        MergeSorter rightTask = new MergeSorter(right,executor);

        // submit both task to executor
        Future<int[]> leftResult = executor.submit(leftTask);
        Future<int[]> rightResult = executor.submit(rightTask);

        // wait for both to finish
        int[] sortedLeft = leftResult.get();
        int[] sortedRight = rightResult.get();

        int[] merged = merge(sortedLeft,sortedRight);

        // Log merge completion
        System.out.println(threadName + " - Merged:  " + Arrays.toString(merged));

        return merged;
    }

    public int[] merge(int[] left,int[] right){
        int i=0, j=0, k=0;
        int[] merged = new int[left.length+right.length];

        while(i < left.length && j< right.length){
            if(left[i] <= right[j]){
                merged[k++] = left[i];
                i++;
            }
            else{
                merged[k++] = right[j];
                j++;
            }
        }

        while(i < left.length){
            merged[k++] = left[i];
            i++;
        }

        while(j < right.length){
            merged[k++] = right[j];
            j++;
        }

        return merged;
    }
}