package com.manhatten.java8;
interface MyInter{
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
}

class MyInterImpl implements MyInter{
	public static void sum(int a, int b) {
		System.out.println("I am from Child Class");
		System.out.println(a+b);
	}
}
public class StaticMethodEx {

	public static void main(String[] args) {
		MyInterImpl my = new MyInterImpl();
		my.sum(20, 30);
		MyInter.sum(10, 20);
	}

}
