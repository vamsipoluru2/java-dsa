import java.util.ArrayList;
import java.util.LinkedList;


class Employee{
	int id;
	String name;
	Double salary;
	
	public Employee(int id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	// invoke to sting in class 
	
}
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Object> l1=new LinkedList<>();
		l1.add(20);
		l1.add(30);// this method in collection framework
		System.out.println(l1);
		l1.add(2,40);//this method only in LL
		System.out.println(l1);
		l1.addFirst(50);
		System.out.println(l1);
		l1.addLast(50);
		System.out.println(l1);
		
		
//		l1.subList(1, 3).clear();
		LinkedList<Object> l2=new LinkedList<>();
		l2.add(20.5);
		l2.add(20.6);
		l2.add(20.8);
		

		
		l1.addAll(2,l2);
		System.out.println(l1);
		
		//inter conversion
		ArrayList<Object> ar=new ArrayList<>(l1);
		System.out.println(ar);
		Integer i=50;
		ar.remove(i);
		System.out.println(ar);
		
		Integer i1=50;
		ar.remove(i1);
		System.out.println(ar);
		
		// LinkedList<Object> l3=new LinkedList<>();
		l2.add(22.45);
		System.out.println(l2);

		
		
		Employee e1=new Employee(001,"vamsi",200000d);
		Employee e2=new Employee(002,"Mudit",300000d);
		Employee e3=new Employee(003,"Rahul",400000d);
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		
		
		System.out.println(l1);

		
		
		
	}

}
