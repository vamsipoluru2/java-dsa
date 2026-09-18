

public class StaticVariableEx {
	int a=10;
	static int b=10;
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		// int b=30;
//		System.out.println(b);
		System.out.println("hi"+b);
		
		StaticVariableEx s1=new StaticVariableEx();
		
		StaticVariableEx s2=new StaticVariableEx();
		s1.a=s1.a+5;
		
		s1.b=s1.b+3;
		
		
		System.out.println(s1.a);//15 a is obj scope 
		System.out.println(b);//13
		System.out.println(s2.a);//10
		System.out.println(b);//13 b is static so it got reflected
		s2.b=s2.b+3;//changing via s2
		System.out.println(b);//16
		

	}

}
