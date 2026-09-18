import java.util.*;

public class Enump{
    public static void main(String[] args) {
       //ENum - Interface
       //Introduced or iterating the leagcy collection objects
       //legacy class hashtable, vector, stack, properties, dictionary
        //how do we iterate 

        //has two methods
        //boolean hasMoreElements()
        //E nextElement()


        Vector<String> v = new Vector<String>();
        Enumeration<String> e = v.elements();

        v.add("A");
        v.add("B"); 
        v.add("C");
        
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //we can take any collection object and convert it into enumeration object
        //like in place of Vector in the above object we can take any collection object and convert it into enumeration object only for legacy collection objects
        //but iteration is not possible for the new collection objects like ArrayList, HashSet, HashMap etc. because they are not legacy collection objects
        //we can use iterator for the new collection objects like ArrayList, HashSet, HashMap etc. because they are not legacy collection objects 


        


    }
}