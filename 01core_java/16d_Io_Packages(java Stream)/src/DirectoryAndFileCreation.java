import java.io.File;
import java.io.IOException;

public class DirectoryAndFileCreation {
	public static void main(String[] args) {
		File file=new File("Manhatten");//retetative path current dir
		if(file.mkdir()) {
			System.out.println("Directory got Created");
		}else {
			System.out.println("Not created..");
		}
		
		File f= new File("Manhatten\\MyFile");
		try {
			if(f.exists()) {
				System.out.println("already exists");
			}else {
			f.createNewFile();
			System.out.println("file Created");
			}
		}catch(IOException e) {
			System.out.println("some error while creating");
		}
	
		
		
	}
}
