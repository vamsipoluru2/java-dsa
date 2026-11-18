
import java.io.File;
import java.io.IOException;
public class Filehandling {
    public static void main(String[] args) throws IOException {
        File f = new File("TextFiles.txt");//(path of the file, relative to this src folder)
        System.out.println(f.exists());
        System.out.println(f.delete());
        System.out.println(f.createNewFile());

        System.out.println(f.isHidden());
        System.out.println(f.canWrite());
        f.setWritable(true);
        System.out.println(f.canWrite());



    }
}