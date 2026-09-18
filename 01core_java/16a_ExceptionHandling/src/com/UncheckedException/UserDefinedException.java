package com.UncheckedException;

//custom defined exception
class NegativeNumberException extends RuntimeException{
	public NegativeNumberException(String s) {
		System.out.println(s);//print the error message
	}
}
	
//constructor with argumeent with error msg
	class Cube{
		void cube(int a) {
			if(a>0) {
			System.out.println(a*a*a);
			}
			
			else {
				throw new NegativeNumberException("Negative numbers are not allowed:");
			}
		}
}
	


	public class UserDefinedException {
	public static void main(String[] args) {
		  Cube obj = new Cube();

	        obj.cube(5);   
	        obj.cube(-3);   
		
	}
}
