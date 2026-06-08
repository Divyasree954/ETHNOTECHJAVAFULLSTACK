//Access Modifiers in Java Oops
package Oops.Encapsulation;
class AccessModi{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
class AccessModi1 extends AccessModi{
    void print(){
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);
    }
}
public class Encap{
    public static void main(String[] args) {
        AccessModi1 acc=new AccessModi1();
        acc.print();
    }
}