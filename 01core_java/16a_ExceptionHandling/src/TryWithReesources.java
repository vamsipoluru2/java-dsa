import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;


public class TryWithReesources {
    public static void main(String[] args) throws Exception {
     File file=new File("./Sample.txt");
        if(!file.exists())
            file.createNewFile();


        //Autoclosable resources are those that implement the AutoCloseable interface, which includes most I/O classes in Java. When used in a try-with-resources statement, these resources are automatically closed at the end of the statement, even if an exception occurs. This helps to prevent resource leaks and ensures that resources are properly released.
        try(//those with auto closeable interface can be used in try with resources
            FileReader fr=new FileReader(file);
            FileInputStream fis=new FileInputStream(file);
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr)
        ){

            String text=new String();
            String line=new String();
            while((line=br.readLine())!=null){
                text +=line+"\n";
            }
                System.out.println(text);
            

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}


// Q: What is Try-With-Resources?

// A feature introduced in Java 7 that automatically closes resources implementing AutoCloseable.

// Q: Which method is automatically called?

// close()

// Q: In what order are resources closed?

// Reverse order of creation.

// Q: Which interface must a resource implement?

// AutoCloseable (or its subinterface Closeable).

// This is an important Core Java interview topic because it combines exception handling, file handling, and interfaces.