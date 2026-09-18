package com.manhatten.java8;
interface StudentInt{
	Student1 get(String s);
}

class Student1{
	String s;
	public Student1(String s) {
		System.out.println("constructor Ref :"+s);
	}
	
}


public class ConstructorEx {
	public static void main(String[] args) {
	StudentInt s=Student1::new;
	s.get("Ajay");
	}
}
