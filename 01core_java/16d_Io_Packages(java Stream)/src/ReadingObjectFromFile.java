import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class ReadingObjectFromFile {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream("Vehicle");
			ObjectInputStream os = new ObjectInputStream(fs);
			Vehicle a = (Vehicle) os.readObject();
			Vehicle b = (Vehicle) os.readObject();
			System.out.println(a);
			System.out.println(b);
			
		}
		catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}
 
 
 