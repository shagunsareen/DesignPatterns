package sareen.shagun.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumber implements Runnable{
    int numToPrint;

    PrintNumber(int number){
        this.numToPrint = number;
    }

    @Override
    public void run() {
        System.out.println(numToPrint);
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        //print numbers from 1 to 100

        //Method 1 : simple creating 100 tasks and passing it into thread to work
        /*for(int i=0; i<100; i++){
            PrintNumber printNumber = new PrintNumber(i);
            Thread thread = new Thread(printNumber);
            thread.start();
            //thread.join();  --> allows one thread to complete and then the second thread starts
        }*/

        //Method 2 : Use Executor Service instead of creating 100 threads. Create a pool of 10 threads and execute your tasks using those
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0; i<100; i++){
            PrintNumber printNumber = new PrintNumber(i);
            executorService.execute(printNumber);
        }

        executorService.shutdown();
    }
}