package com.manhatten.java8;

interface StudentInt1{
	Student10 get(String s);
}

class Student10{
	String s;
	public Student10(String s){ 
		System.out.println("Constructor Reference: "+s);
	}
}
public class ConstructorRef {

	public static void main(String args[]) {
		StudentInt1 s = Student10::new;
		s.get("Ajay");
	}

}
