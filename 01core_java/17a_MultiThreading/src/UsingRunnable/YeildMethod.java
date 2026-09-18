package UsingRunnable;


class MyThread2 implements Runnable{
	
	public void run() {
		
		Thread.yield();//this make temp pause the excutaion of child thread  if i put here  
		//Like priority, yield() is only a hint to the scheduler — not guaranteed.
		  
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread"+i);
		}
		
	}
}
	
public class YeildMethod {
	public static void main(String[] args) {
		MyThread2 my= new MyThread2();
		Thread t=new Thread(my);
		t.start();
		//Thread.yield();//this make temp pause the excutaion of main thread  if i put here  

		for(int i=1;i<=10;i++) {
		System.out.println("Parent thread"+i);
		}
	
//		Thread.yield() is only a hint, not a strict rule.
//
//		When a thread calls yield(), it says to the scheduler:
//
//		"I’m willing to pause now, please let another thread of the same or higher priority run."
		//Like priority, yield() is only a hint to the scheduler — not guaranteed
	}
}