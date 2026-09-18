package Syncronization;



class Display1 {
	public  synchronized void trainingRoom(String trainerName,String PL) {
				
		for(int i=1;i<10;i++) {
				System.out.println("Hi,i am at sysncronized block"+"From trainer: "+trainerName+"PL: "+PL);
				
				try{
					Thread.sleep(2000);
					}catch(Exception e) {
						e.printStackTrace();
					
			}
			
		}
		System.out.println("Out of the Synchronization Block");
	}
	
}

class MyThread1 extends Thread{
	
	
	String trainerName;
	String PL;
	Display1 d;
	
	public MyThread1(String trainName,String PL,Display1 d) {
		this.trainerName=trainName;
		this.PL= PL;
		this.d=d;
	}
	
	public void run() {
		d.trainingRoom(trainerName,PL);

	}
	public void show() {
		trainerName.concat("vasmsi");
	}
}
	
public class SyncByMethod {
	public static void main(String[] args) {
	
		Display d=new Display();
		
//		// if two display given with dif obj then they both get printed at once
//		Display d2=new Display();
		
		MyThread t1=new MyThread("mudit","java",d);
		MyThread t2=new MyThread("Rahul","python",d);
		
		//if main method got syncronized then the scheduler will take which to run first
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Method..");
	}

}

