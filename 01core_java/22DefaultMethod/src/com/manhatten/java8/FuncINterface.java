package com.manhatten.java8;
@FunctionalInterface  // this make sure only one methode
interface Addition{
	int sum(int a,int b);
}

//@FunctionalInterface
//interface Runnable {
//    void run(); 
//}


public class FuncINterface {
	public static void main(String[] args) {
		Addition ad=(a,b)->a+b;
		System.out.println(ad.sum(10, 20));
		
		Runnable r=()->{ System.out.println("i am from run interface");};
		Thread th=new Thread(r);
		th.start();
		
	}
}
