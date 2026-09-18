class MyInterfaceIm implements Interfacedemo{
	public void show() {
		System.out.println("i am vamsi");
		System.out.println("a= "+a); 
	}
	public void add() {
		System.out.println("hi"+(a+b));
	}
	
	public void tell() {
		System.out.println("i am belongs to myInterfaceIm");
	}
	//here if diff methods given also in class the multiple inhertance wont happen 
}
public class MyInterfaceImpl{
	public static void main(String[] args) {
		MyInterfaceIm demo=new MyInterfaceIm();
		demo.show();
		System.out.println(Interfacedemo.a);
		demo.add();
		
		demo.tell();
		// System.out.println(Interfacedemo2.b);
	}
}

//
//Interfacedemo demo = new MyInterfaceIm(); → only methods from Interfacedemo are visible.
//
// Interfacedemo2 demo2 = new MyInterfaceIm(); //→ only methods from Interfacedemo2 are visible.
//
//MyInterfaceIm obj = new MyInterfaceIm(); → all methods are visible.