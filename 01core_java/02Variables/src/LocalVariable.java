class vamsi{
	
}

public class LocalVariable {

	public static void main(String[] args) {
		int a=10;
		final int b=20;
		int c= b+30;
		System.out.println(c);//can modify using 3 rd variable 
		System.out.println(b);// can't modify due to final
		System.out.println(a);
	}

}
