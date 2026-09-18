package ByExtendingThread;
class MyThread extends Thread{
 
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("Child Thread" + i);
		}
	
	}
}
public class ByExtendingThreadEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t= new MyThread();
		t.start();
		for(int i=1; i<=10;i++) {
			System.out.println("Parent Thread -" + i);
		}
		
 
	}
 
}