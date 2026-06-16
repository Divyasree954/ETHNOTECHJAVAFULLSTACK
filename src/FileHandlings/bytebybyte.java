package FileHandlings;
import java.io.*;
import java.util.Scanner;
public class bytebybyte {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting a file");
        String path="C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\FileHandlings\\test.txt";
        File f1=new File(path);
        File f2=new File("C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\FileHandlings\\test2.txt");
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);
        int ch;
        while((ch=fis1.read())!=-1){
            System.out.print((char)ch);
             fos2.write(ch);
        }
        fis1.close();
        fos2.close();

    }

}
