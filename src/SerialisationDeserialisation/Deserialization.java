package SerialisationDeserialisation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\SerialisationDeserialisation\\serialisation.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Serialisation s=(Serialisation) ois.readObject();
        s.display();
        ois.close();
        fis.close();
    }
}
