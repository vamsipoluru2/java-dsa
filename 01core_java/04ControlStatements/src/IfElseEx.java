
public class IfElseEx {
	public static void main(String[] args) { 
	int a=7,b=2,c=12;
	
	if(a>b) {
		System.out.println("a is greater");
	}
	else {
		System.out.println("b is greater");
	}
	
	// else if ladder
	if(a>b&&a>c) {
		System.out.println("a is greater number");
	}
	else if(b>a && b>c) {
		System.out.println("b is greater number");
	}
	else {
		System.out.println("c is greater");
	}
	
	//nested if
	
	int d=10,e=112,f=105;
	if(d>e) {
		if(d>f) {
			System.out.println("d is greater");
		}
		else {
			System.out.println("f is greater");
		}
	}
	else {
		if(e>f) {
			System.out.println("e is greater");
		}
		else {
			System.out.println("f is greater");
		}
	}

	
	
}
	
}
