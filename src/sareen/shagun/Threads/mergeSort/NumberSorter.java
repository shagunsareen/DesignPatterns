package sareen.shagun.Threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class NumberSorter implements Callable {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    NumberSorter(List<Integer> input, ExecutorService es) {
        this.arrayToSort = input;
        this.executorService = es;
    }

    //this method is to sort the data
    @Override
    public Object call() throws Exception {
        int size = arrayToSort.size();
        if (size <= 1) {
            return arrayToSort;
        }

        int mid = size / 2;
        List<Integer> leftArr = new ArrayList<>();   //leftArrayToSort
        List<Integer> rightArr = new ArrayList<>();  //rightArrToSort

        for (int i = 0; i < mid; i++) {
            leftArr.add(arrayToSort.get(i));
        }

        for (int j = mid; j < size; j++) {
            rightArr.add(arrayToSort.get(j));
        }

        //now we have left and right arrays, lets merge them using threads
        NumberSorter leftSorter = new NumberSorter(leftArr, executorService);
        NumberSorter rightSorter = new NumberSorter(rightArr, executorService);

        //fetch future object once array is sorted
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        // if future is not yet done, code will wait here till the time future is completed
        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        //now we have to merge the arrays
        List<Integer> sortedArr = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                sortedArr.add(leftSorted.get(i));
                i++;
            } else {
                sortedArr.add(rightSorted.get(j));
                j++;
            }
        }

        //insert rest of the numbers if any one of the list is complete
        while (i < leftSorted.size()) {
            sortedArr.add(leftSorted.get(i));
            i++;
        }

        while (j < rightSorted.size()) {
            sortedArr.add(rightSorted.get(j));
            j++;
        }

        return sortedArr;
    }
}
