
package com.manhatten.java8;
interface DefaultMethod{
	public default void show() {
		System.out.println("Defaiult Show mwthod of the DefaultMethodDemo Interface");
		//Here it can be dummy body like only {}
	}
}
 
 
interface DefaultMethod2 {
	public default void show() {
		System.out.println("Defaiult Show mwthod of the DefaultMethodDemo2 Interface");
		
	}
}
class DefaultMethodDemoImpl implements DefaultMethod,DefaultMethod2{
	
	  @Override
	  
	  public void show() {
		  DefaultMethod.super.show();
	        DefaultMethod2.super.show();
	        System.out.println("Show mwthod of the DefaultMethodDemo class");
	  
	  }
	
}
public class DefultMethodEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethodDemoImpl d = new DefaultMethodDemoImpl();
		d.show();
	}
 
}
 