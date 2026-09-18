
	class PrintStream1{
		public void println1(String s) {
			System.out.println(s);
			
		}
}
	class System1{
		static PrintStream1 out1=new PrintStream1();
	}

public class PrintStreamEx {
	public static void main(String[] args) {
		System1.out1.println1("my printstream class");
		System.out.println("predefined class");
	}
}
