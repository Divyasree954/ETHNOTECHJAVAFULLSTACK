package Generics;

public class main {
    public static void main(String[] args) {
        content<String>c1=new content<>();
        c1.setName("DS");
        System.out.println(c1.getName());
        item<String,Double,Boolean>i=new item("Div",19.6,true);
        System.out.println(i.getName()+" "+i.getPrice()+" "+i.getGood());
    }
}
