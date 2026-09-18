import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<>();
		//  no duplicates and inserstion
		// help to remove duplicates from other collection grp obj jus pass it into hash set
		h.add(10);
		h.add(20.99);
		h.add("vamsi");
		System.out.println(h.add('a'));
		System.out.println(h.add(10));
		System.out.println(h);
		
		
	}

}
