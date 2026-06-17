package SerialisationDeserialisation;
import java.io.Serializable;
public class Serialisation implements Serializable {
    int id;
    String name;

    public Serialisation(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
