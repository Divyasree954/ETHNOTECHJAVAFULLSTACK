package FileHandlings;
import java.io.*;
public class files {
    public static void main(String[] args) throws IOException {
        //creating a file
        System.out.println("Starting a file");
        String path="C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\FileHandlings\\tes.txt";
        File f=new File(path);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int ch;
        int c=0;
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
            c++;
        }
        System.out.println(c);
    }
}