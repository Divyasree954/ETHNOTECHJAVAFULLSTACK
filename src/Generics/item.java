package Generics;

public class item <T,U,V>{
    T name;
    U price;
    V good;
    item(T name,U price,V good){
        this.name=name;
        this.price=price;
        this.good=good;
    }

    public T getName() {
        return name;
    }


    public U getPrice() {
        return price;
    }

    public V getGood() {
        return good;
    }
}
