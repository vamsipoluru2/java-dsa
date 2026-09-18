import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;
public class Programe1{
    public static void main(String[] args)throws Exception {
        File file = new File("DBconfig.properties");
        if(!file.exists()){
            file.createNewFile();
        }
        Properties prop = new Properties();
        prop.setProperty("url", "localhost");
        prop.setProperty("username", "admin");
        prop.setProperty("password", "secret");

        // Save properties to file
        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos, "Database Configuration");
        fos.close();
        
        // Load properties from file
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);

        Set<String> keys = prop.stringPropertyNames();
       System.out.println(keys);
    }

}

