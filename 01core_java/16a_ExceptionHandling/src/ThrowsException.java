import java.io.File;
import java.io.IOException;

//checked Exception 
public class ThrowsException {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		File f=new File("E://myfile");
//		f.createNewFile();
//		
		try {
			int a=10,b=0;
			System.out.println(a/b);
			
			File f1=new File("E.//myfile");
			f1.createNewFile();
			
			
//			both runtime and IOEx are same level class  last should be the parent class
		
		}//catch(Exception e) {} //Exception is super class of all means it is the parent 
		catch(RuntimeException a) {
			System.out.println("cant divide by zero");
//		}catch(IOException io) {
//			System.out.println("file is not found");
		}catch(Exception e) {//it will automatically runs due to parent class
			System.out.println("file is not found");
		}finally {// it will always excuted 
			System.out.println("i am in finally block");
		}

	}
}

// i doesent know what exception to use we can use parent name like EXception or runtimeException

//	public static void main(String[] args)// throws ArthematicException {
//		// TODO Auto-generated method stub
//		try {//riskey code
//		int a=10,b=0;
//		
//		System.out.println(a/b);
//
//}
