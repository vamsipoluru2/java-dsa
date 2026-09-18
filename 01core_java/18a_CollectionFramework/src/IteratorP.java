import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorP {
    public static void main(String[] args) {
       //Iterator - Interface
       //Introduced or iterating the all collection objects
        //how do we iterate 

        //has two methods
        //boolean hasNext()
        //E next()
        //remove() - optional method


        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2); 
        v.add(3);

        Iterator<Integer> e = v.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

        //we can use iterator for the new collection objects like ArrayList, HashSet, HashMap etc.
        //  because they are not legacy collection objects 

        //for hashmap we can use entrySet() method to get the set of entries and then we can use iterator to iterate over the entries

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.keySet().iterator(); //- returns a set view of the keys contained in this map
        map.values().iterator(); //- returns a collection view of the values contained in this map
        map.entrySet().iterator(); //- returns a set view of the mappings contained in this map

    }
}
