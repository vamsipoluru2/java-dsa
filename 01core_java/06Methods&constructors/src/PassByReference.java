
public class PassByReference {
	int a,b;
	int sum(int a,int b) {
		return a+b;
	}
	void sum(PassByReference ob) {
		System.out.println(ob.a+ob.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByReference ob=new PassByReference();
		ob.a=30;
		ob.b=20;
		ob.sum(ob);//pass by reference
		System.out.println(ob.sum(30,40));//this is pass by value
		
		PassByReference ob2=new PassByReference();
		ob.sum(ob2);
		
		
	}

}
