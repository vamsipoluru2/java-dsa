class parent{
	void show() {
		System.out.println("parent class");
	}
}

class child extends parent{
	void display() {
		System.out.println("child");
	}
}
public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch = new child();
		ch.show();
		ch.display();//create object of child class and call both parent and child class methods because of inheritance
	}

}
