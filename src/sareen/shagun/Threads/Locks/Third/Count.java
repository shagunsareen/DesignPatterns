package sareen.shagun.Threads.Locks.Third;

public class Count {
    int value;

    synchronized void add(int val){
        this.value += val;
    }
}
