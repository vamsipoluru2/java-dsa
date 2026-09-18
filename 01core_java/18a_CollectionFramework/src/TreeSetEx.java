import java.util.Comparator;
import java.util.TreeSet;


class ComparatorImpl implements Comparator<Object>{

	@Override
	// we implemented the interface and we have created our own method
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1>i2) {
			return -1;
		}else if(i2>i1){
			return 1;
		}else {
			return 0;
		}
	}
	
}
public class TreeSetEx {
	
	public static void main(String[] args) {
		
	     ComparatorImpl c=new ComparatorImpl();
		TreeSet<Integer> t=new TreeSet<>(c);
		t.add(10);
//		t.add("Hello");//diff type of obj is not allowed
		t.add(5);
	    t.add(20);
	    t.add(15);

	        System.out.println(t);

	        System.out.println("First element: " + t.first());
	        System.out.println("Last element: " + t.last());
	        System.out.println("HeadSet (<15): " + t.headSet(15));
	        System.out.println("TailSet (>=15): " + t.tailSet(15));
	        System.out.println("SubSet (5-20): " + t.subSet(20,4));
	}
	
	
	
	
}
