import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		
		ArrayList<Object> L=new ArrayList<>();
		
		L.add(20);
		L.add(22.6);
		L.add("hELLO");
		L.add(50);
		Student s=null;
		L.add(s);
		
		System.out.println(L);
		
		Iterator<Object> i=L.iterator();//due to it is an interface
		
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println();
		System.out.println(L);
		
		
	}

}
