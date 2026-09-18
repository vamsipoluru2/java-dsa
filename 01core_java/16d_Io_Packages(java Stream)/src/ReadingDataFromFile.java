
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadingDataFromFile {

		public static void main(String[] args) {
			BufferedReader br;
			try {
					br=new BufferedReader(new FileReader("Manhatten\\Myfile"));
				String line;
				while((line=br.readLine())!=null) {
					
					System.out.println(line);
				}
				System.out.println("writing Operation done");

				
			} catch (IOException e) {
				
				e.printStackTrace();
			
			}

	}
}



