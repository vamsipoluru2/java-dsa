
package com.manhatten.java8;

class A{
	public void thisISMyMethodOverriding(){
		System.out.println("methodOVerridden in A class");
		
	}
}

class B extends A{
	@Override
	public void thisISMyMethodOverriding(){//if name is wrong overide give complie error
		System.out.println("methodOVerridden in B class");
		
	}
}
public class lamdaExpEx {
	public static void main(String[] args) {
		A a=new B();
		a.thisISMyMethodOverriding();
	}
}
