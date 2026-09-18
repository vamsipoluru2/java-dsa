package com.checkedException;


class NegativeNumberException extends Exception{
	public NegativeNumberException(String s) {
		System.out.println(s);
	}
}

class Cube{
	void cube(int a) throws NegativeNumberException {
		if(a>0) {
		System.out.println(a*a*a);
		}
		
		else {
			throw new NegativeNumberException("Negative numbers are not allowed:");
		}
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj = new Cube();
		try {

	        obj.cube(5);   
	        obj.cube(-3);
		}catch (NegativeNumberException e) {
			System.out.println("only positive number: ");
		}


	}

}
