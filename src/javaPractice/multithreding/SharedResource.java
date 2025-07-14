package javaPractice.multithreding;

public class SharedResource {
    private int counter;

    public synchronized void increment(Thread thread){
        counter++;
        System.out.println("Counter incremented to "+counter+" by "+thread);
    }
}
