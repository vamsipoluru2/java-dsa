
public class StaticMethod {
	
	static int sum(int a,int b) {
		return a+b;
	}
	
	public static void main( String[] args) {
		System.out.println(sum(10,20));//direct call without creating object because it is static method 
		System.out.println(ArthematicOp.div(10, 5));//if out side the main class call with class name 
	}
	static class a1{ 
		int a;
		void a2() {
			
		}
	}
}


class ArthematicOp{
	static int div(int a,int b) {
		return a/b;
	}
	
}
