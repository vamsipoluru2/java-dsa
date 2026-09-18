package UsingRunnable;
class MyThread3 implements Runnable{
	
	public void run() {
		
		  
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread"+i);
		}
		
	}
}


public class JoinMethod {
	public static void main(String[] args) {
		MyThread3 my= new MyThread3();
		Thread t=new Thread(my);
		t.start();
		
		try {
			t.join(1000);//where ever join isthere it waits here it is in parent so it waits
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++) {
		System.out.println("Parent thread"+i);
		}
	

}
	}
