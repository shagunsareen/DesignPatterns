package sareen.shagun.Threads.Locks.Third;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            count.add(i);
            System.out.println( "Added : "+ count.value);
        }
    }
}
