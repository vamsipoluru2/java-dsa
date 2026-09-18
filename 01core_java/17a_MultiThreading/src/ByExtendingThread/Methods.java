package ByExtendingThread;

class MyThreads extends Thread{
	 
	public void run() {
//
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);		
		System.out.println(Thread.currentThread().getPriority());
//	
		
		for(int i=1; i<=10;i++) {
			System.out.println("Child Thread" + i);
		}
	
	}
}

public class Methods {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThreads t= new MyThreads();
		t.start();
//		String n1 = t.setName("Child.......");
		
		//wheather the priority is less or more in run mwthod the first 
		// thing is excuted is main thing 
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(1);//set priority range is 1 to 10

		System.out.println(Thread.currentThread().getPriority());

		
		for(int i=1; i<=10;i++) {
			System.out.println("Parent Thread -" + i);
		}
		
 
	}
}