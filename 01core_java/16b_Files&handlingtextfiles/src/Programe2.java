import java.io.File;
// import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Programe2  {
    public static void main(String[] args) throws IOException {
        File file=new File("./Sample.txt");
        if(!file.exists())
            file.createNewFile();
    
        Scanner sc=new Scanner(file);
        String str="";//using string to store the data of the file

        while (sc.hasNextLine()) {
            str+=sc.nextLine()+"\n";
            // System.out.println(sc.nextLine());//if we want to read the whole file we can use loop
        }
        System.out.println(str);
        sc.close();
    }
}
 