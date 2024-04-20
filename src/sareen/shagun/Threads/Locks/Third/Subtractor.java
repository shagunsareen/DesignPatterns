package sareen.shagun.Threads.Locks.Third;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
           count.add(-i);
            System.out.println( "Subtracted : "+ count.value);
        }
    }
}
