
public class ArthematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//riskey code
		int a=10,b=0;
		
		System.out.println(a/b);
		}catch(ArithmeticException a) {
			System.out.println("don't divide by zero");
		}
		
	}

}
