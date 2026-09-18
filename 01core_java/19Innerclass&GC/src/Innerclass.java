class A{
	class B{
		void show() {
			System.out.println("memberclass");
		}	
	}
	
	static class C{
	 static void show2() {
			System.out.println("i am from class c");
		}
	}
}

class D{//this is not inner class because it is not inside class A
	public static void main(String[] args) {
		System.out.println("i am from class d");
	}
	}


public class Innerclass {
	public static void main(String[] args) {
		A a=new A();
		a.new B().show();//creating obj on top of A
		A.C.show2();
	}

}
 