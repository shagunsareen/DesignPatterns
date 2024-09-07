package sareen.shagun.Threads.mergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
            /*List<Integer> arrayToSort = List.of(10,2,8,4,11,9);
            ExecutorService es = Executors.newCachedThreadPool();

            //create task and give it to sort the method
            Sorter sort = new Sorter(arrayToSort, es);
            Future<List<Integer>> sortedArrayFuture = es.submit(sort);
            List<Integer> sortedList = sortedArrayFuture.get();
            for(Integer i : sortedList){
                System.out.println(i);
            }
            es.shutdown();*/

        List<Integer> list = Arrays.asList(10, 2, 8, 11, 9, 1);

        //to execute this task we need either thread or thread pool , so we will define executor service
        ExecutorService es = Executors.newCachedThreadPool();

        //pass this es to task so that the task can be executed by the task
        //to sort this list using merge sort we need to pass this list to a task which will return the sorted list
        NumberSorter sort = new NumberSorter(list, es); //task

        //now get the result as the sorted array
        Future<List<Integer>> result = es.submit(sort); //execute the task , execution will come till here and go to next line even if the thread execution is in progress. It wont wait for execution to complete
        List<Integer> sortedList = result.get(); //this is where we wait for the result to be completely processed
        for (Integer i : sortedList) {
            System.out.println(i);
        }
        es.shutdown();
    }
}
