package sareen.shagun.Threads.mergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;
    public Sorter(List<Integer> arrayToSort, ExecutorService es) {
        this.arrayToSort = arrayToSort;
        this.executorService = es;
    }

    //this method should sort the data
    @Override
    public List<Integer> call() throws Exception {
        int n = arrayToSort.size();

        //base case
        if(n <= 1){
            return arrayToSort;
        }

        int mid = n/2;
        List<Integer> leftArrList = new ArrayList<>();
        List<Integer> rightArrList = new ArrayList<>();

        for(int i=0; i<mid; i++){
            leftArrList.add(arrayToSort.get(i));
        }

        for(int j=mid; j<n; j++){
            rightArrList.add(arrayToSort.get(j));
        }

        //now we have left and right arrays, lets merge them using threads
        ExecutorService es = Executors.newCachedThreadPool();

        Sorter leftSorter = new Sorter(leftArrList, es);
        Sorter rightSorter = new Sorter(rightArrList, es);

        //fetch future object once array is sorted
        Future<List<Integer>> leftFuture =  es.submit(leftSorter);
        Future<List<Integer>> rightFuture = es.submit(rightSorter);

        List<Integer> leftSortedArr = leftFuture.get();  // if future is not yet done, code will wait here till the time future is completed
        List<Integer> rightSortedArr = rightFuture.get();

        List<Integer> sortedArr = new ArrayList<>();

        //now we have to merge the arrays
        int i=0;
        int j=0;

        while(i < leftSortedArr.size() && j<rightSortedArr.size()){
            if(leftSortedArr.get(i) < rightSortedArr.get(j)){
                sortedArr.add(leftSortedArr.get(i));
                i++;
            }else{
                sortedArr.add(rightSortedArr.get(j));
                j++;
            }
        }

        while(i < leftSortedArr.size()){
            sortedArr.add(leftSortedArr.get(i));
            i++;
        }

        while(j < rightSortedArr.size()){
            sortedArr.add(rightSortedArr.get(j));
            j++;
        }

        return sortedArr;
    }
}
