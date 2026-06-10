package Threads.Basicsofthreads;

public class my {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("The creation of thread");
        myt t=new myt();
        t.start();
        for (int i = 1; i <=3 ; i++) {
            t.join();
            System.out.println(i);
        }
    }
}
