package ByExtendingThread;


class MyThread2 extends Thread{
 
	public void run() {
		
		for(int i=1; i<=10;i++) {
			try {
				Thread.sleep(500); //milisecond it is
				}
				catch(InterruptedException e){
					e.printStackTrace();  //it will print details of interruption and exceptions
				}
			System.out.println("Child Thread" + i);
		}
	
	}
}
public class SleepMethod {
 
	public static void main(String[] args) {
		
 
		MyThread2 t= new MyThread2();
		t.start();
 
		for(int i=1; i<=10;i++) {
			System.out.println("Parent Thread -" + i);
		}
		
 
	}
 
}
