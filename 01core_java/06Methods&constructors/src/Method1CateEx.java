public class Method1CateEx {
	//with arguments and with return type
	int sum(int a,int b) {
		return a+b;
	}
	
	//with arguments and without return type
	void square(int x) {
		System.out.println(x*x);
	}
	
	//without arguments and with return type
	double A() {
		double a=10.55, b=10.01;
		return a+b;
		
	}
	
	//without arguments and without return type
	 void show() {
	        int a = 10;
	        System.out.println("The value of a = " + a);
	    }
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Method1CateEx ob=new Method1CateEx();
		
		//with arguments and with return  type
		int c=ob.sum(10, 20);
		System.out.println(c);
		System.out.println(ob.sum(100,50));
		
		//with arguments and without return type
		ob.square(2);
		
		//without arguments and with return type

		System.out.println(ob.A());
		
		//without arguments and without return type
		ob.show();
	}

}
