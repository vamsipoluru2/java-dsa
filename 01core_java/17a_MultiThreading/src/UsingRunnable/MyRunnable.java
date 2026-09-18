package UsingRunnable;

class MyThread implements Runnable{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread"+i);
		}
		
	}

}

public class MyRunnable {
	public static void main(String[] args) {
		
		MyThread my= new MyThread();
		Thread t=new Thread(my);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Parent thread"+i);
		}
		
	}

}
