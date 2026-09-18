import java.util.ArrayList;
import java.util.List;

class Student{
	
}
public class ArrayListEx {
	public static void main(String[] args) {
		List<Object> l=new ArrayList<>();//if we specify the generics it is typesafe
		l.add(20);
		l.add(2.6);
		l.add("Hello");
		Student s=null;
		
		l.add(s);
		System.out.println(l);
		System.out.println(l.contains(20));
		System.out.println(l.isEmpty());
		
		ArrayList<Object> ar=new ArrayList<>();// all the collection of l values are add in ar
		ar.addAll(l);
		System.out.println(ar);
		ar.remove(2.6);
		System.out.println(ar);
		l.retainAll(ar);// what ever values in ar that will be retained
		System.out.println(l);
		
		l.add(30);
		System.out.println(l);
		l.removeAll(ar);
		System.out.println(l);
	}
}
