package FileHandlings;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) throws IOException {
        //creating a file
        System.out.println("Starting a file");
        String path="C:\\Users\\dsree\\IdeaProjects\\JAVA FULLSTACK\\src\\FileHandlings\\test.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        bw.write(str);
        bw.newLine();
        bw.close();
        fw.close();
    }
}
