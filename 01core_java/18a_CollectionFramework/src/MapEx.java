import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Company", "Manhatten");
		hm.put("PL","java");
		hm.put("city", "Bangalore");
		
		System.out.println(hm);
		System.out.println(hm.get("PL"));
		System.out.println(hm.containsKey("city"));
		System.out.println(hm.containsValue("java"));
		System.out.println(hm.keySet());
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.values());
		
		LinkedHashMap<Integer, String> lhm= new LinkedHashMap<Integer, String>();
		//type got restricted to integer and string with the help of generics
		lhm.put(1001, "Mudit");
		lhm.put(1002, "Rahul");
		lhm.put(1003, "vamis");
		System.out.println(lhm);
//		lhm.putFirst(10, "vams");from java 21 only
		System.out.println(lhm);
		
		TreeMap<Integer, String> tm= new TreeMap<>();///keys are getting sorted due to tree map
		tm.put(20, "bat");
		tm.put(10,"ball");
		tm.put(30,"base");
		System.out.println(tm);
	}
}
