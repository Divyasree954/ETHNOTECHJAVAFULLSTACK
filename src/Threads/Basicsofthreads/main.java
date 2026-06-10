package Threads.Basicsofthreads;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(Thread.currentThread().getName());
        System.out.println("The creation of Threads");
        MyThreads t = new MyThreads();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
