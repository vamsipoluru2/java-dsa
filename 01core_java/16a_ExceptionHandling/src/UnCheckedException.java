
public class UnCheckedException {
	public static void main(String[] args) {
		
		
	try {
		System.out.println("Before Exception");
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	System.out.println(a+b);
	System.out.println("after Exception");// it wont excute bcs before the exce

	}catch(NumberFormatException n){
		System.out.println("only Num are allowed");
	}
	
	System.out.println("outside of try and catch");
	// if string contains number as a string  it converts do not throw exception// "123"
	//if string contains a name as a string it do not converts and throw an exception"a b"
	
	
	// if every thing is correct then 
//	Before Exception
//	70
//	after Exception
//	outside of try and catch

	// if exception happens then
//	Before Exception
//	only Num are allowed
//	outside of try and catch

	
	}
	
	

}
