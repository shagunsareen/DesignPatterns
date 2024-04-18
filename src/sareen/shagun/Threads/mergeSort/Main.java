package sareen.shagun.Threads.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
            List<Integer> arrayToSort = List.of(10,2,8,4,11,9);
            ExecutorService es = Executors.newCachedThreadPool();

            //create task and give it to sort the method
            Sorter sort = new Sorter(arrayToSort, es);
            Future<List<Integer>> sortedArrayFuture = es.submit(sort);
            List<Integer> sortedList = sortedArrayFuture.get();
            for(Integer i : sortedList){
                System.out.println(i);
            }
            es.shutdown();
    }
}
