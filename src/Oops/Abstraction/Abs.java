package Oops.Abstraction;
abstract class vehicle{
    abstract void buy();
    abstract void price();
}
class car extends vehicle{
    @Override
    void buy(){
        System.out.println("car");
    }
    @Override
    void price() {
        System.out.println("300");

    }
}
class bike extends vehicle{
    @Override
    void buy(){
        System.out.println("bike");
    }
    @Override
    void price() {
        System.out.println("300");

    }
}
public class Abs {
    public static void main(String[] args) {
        bike b=new bike();
        b.buy();
        b.price();
    }


}
