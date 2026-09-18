import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;


public class ListItera {
    public static void main(String[] args) {
       //ListIterator - Interface
       //Introduced or iterating only List collection objects
       //its bidirectional iterator and read and write op can perform

        //how do we iterate 

        //has two methods
        //boolean hasNext()
        //E next()
        //add(),remove() 


        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2); 
        v.add(3);

        ListIterator<Integer> e = v.listIterator();
        //forward direction
        while(e.hasNext()){
            System.out.println(e.next());
        }

        e.add(4); //- adds the specified element to the list (optional operation)
        //backward direction
        while(e.hasPrevious()){
            System.out.println(e.previous());
        }
        e.remove(); //- removes from the list the last element that was returned by next() or previous() (optional operation)


        //we can use Listiterator for the List collection objects like ArrayList, LinkedList etc.


        
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
