
public class MethodOverLoading {

	int sum(int a,int b) {
		return a+b;
	}
	
	int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	float sum(float a,float b,float c) {
		return a+b+c;
	}
	
	float sum(int a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading ob=new MethodOverLoading();
		System.out.println(ob.sum(2,3));
		
		System.out.println(ob.sum(2, 3, 4));
		
		System.out.println(ob.sum(2.5f, 5.5f,6.5f));
		
		System.out.println(ob.sum(5, 4.5f));
		}

}

