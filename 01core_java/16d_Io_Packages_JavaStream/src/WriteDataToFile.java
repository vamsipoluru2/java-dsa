import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
	public static void main(String[] args) {
		File file=new File("Manhatten\\MyFile");//here true help to keep the exitsting file and update
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){
			bw.write("java");
			bw.newLine();
			bw.write("apple");
			bw.newLine();
			bw.write("orange");
			bw.newLine();
			bw.write("kiwi");
			bw.newLine();
			bw.write("orange");
			System.out.println("wiiting Operation done");

			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}

}
