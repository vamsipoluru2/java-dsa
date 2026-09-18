package InterThreading;
 
 
class MyThread extends Thread{
	int x;
	public void run() {
		System.out.println("Child thread is updating");
		for(int i=0; i<=5; i++) {
			x=i+1;
			System.out.print("\t"+x);
		}
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Thread Got Interrupted");
		}
		synchronized (this) {
			System.out.println("Notified the main Thread.......");
			notify();
			
		}
	}
}
 
public class InterThreadCommunicationEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("Expecting updation from Child Thread............-");
		//why ???? the below
		synchronized (t) {
			System.out.println("So going into waiting state .---..-.--.");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Recieved Updation");
			System.out.println(t.x);
		}
 
	}
 
}
 