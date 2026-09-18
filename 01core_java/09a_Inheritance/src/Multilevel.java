class GrandParent{
	void show() {
		System.out.println("parent class");
	}
}

class parent1 extends GrandParent{
	void display() {
		System.out.println("i am from child1");
	}
}

class parent2 extends parent1{
	void display2() {
		System.out.println("i am from child2");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent2 ch = new parent2();
		ch.show();
		ch.display();
		ch.display2();
	}

}
