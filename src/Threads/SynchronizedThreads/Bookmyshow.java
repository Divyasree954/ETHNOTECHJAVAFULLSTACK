package Threads.SynchronizedThreads;
class Book{
    int seats=2;
    public synchronized void booking(String name){
        if(seats>=1){
            System.out.println(name +" Booked seat");
            seats--;
        }
       else{
            System.out.println("No seats available");
        }
    }
}
public class Bookmyshow {
    public static void main(String[] args)throws InterruptedException {
        Book book=new Book();
        Thread t1=new Thread(()->{
            book.booking("DS");
        });
        Thread t2=new Thread(()->{
            book.booking("Sree");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
