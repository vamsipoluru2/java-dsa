import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Programe1  {
    public static void main(String[] args) throws IOException {
        File file=new File("./Sample.txt");
        if(!file.exists())
            file.createNewFile();

        FileInputStream fis=new FileInputStream(file);

        int assciicode;
        String str="";//using string to store the data of the file
        while ((assciicode = fis.read()) != -1) {
                str+=(char)assciicode;
            System.out.print((char)assciicode);
            
        }
        System.out.println();
        System.out.println(str);
        
        fis.close();

        //System.out.println((char)fis.read());//read the first byte of the file
        //if we want to read the whole file we can use loop
    }
}
