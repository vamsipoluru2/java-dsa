package com.manhatten.java8;

interface MyInter2{
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
}

class MyinterImp implements MyInter2{
	
//	@Override it cant override
	public static void sum(int a,int b) {
		System.out.println("iam form child");
		System.out.println(a+b);
	}
}
public interface MyInterfaceEx {
	public static void main(String[] args) {
		System.out.println("hi i am from Interface");
		MyInter.sum(10, 20);
		
		MyinterImp my=new MyinterImp();
		my.sum(30, 45);
	
	}

}
