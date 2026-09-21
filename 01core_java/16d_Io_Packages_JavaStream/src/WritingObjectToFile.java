import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
 
public class WritingObjectToFile {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(7444,"Venu");
		Vehicle v2 = new Vehicle(5906,"I10");
		System.out.println(v1+"\n"+v2);
		try {
			FileOutputStream fs = new FileOutputStream("Vehicle");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(v1);
			os.writeObject(v2);
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
 
	}
 
}
 
 