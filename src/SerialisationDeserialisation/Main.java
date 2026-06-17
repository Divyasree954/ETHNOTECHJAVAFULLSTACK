package SerialisationDeserialisation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Serialisation s=new Serialisation(1,"DS");
        s.display();
        String path="C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\SerialisationDeserialisation\\serialisation.txt";
        FileOutputStream fos=new FileOutputStream(path);   //opens file
        ObjectOutputStream oos=new ObjectOutputStream(fos);   //coverts object into bytes
        oos.writeObject(s);   //serialises the object and stores the file
        oos.close();
        fos.close();
    }
}
