package javaPractice.multithreding;

public class MutualExclusion extends Thread {

    private SharedResource sharedResource;

    public MutualExclusion(SharedResource resource){
        this.sharedResource=resource;
    }
    public void run(){
        for(int i=0;i<5;i++)
            sharedResource.increment(Thread.currentThread());
    }
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MutualExclusion t1 = new MutualExclusion(resource);
        MutualExclusion t2 = new MutualExclusion(resource);
        t1.start();
        t2.start();
    }
}
