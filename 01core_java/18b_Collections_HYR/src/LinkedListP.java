import java.util.*;

public class LinkedListP {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("10");
        al.add("20");


        List<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add(1,"C");
        ll.addAll(al);
        //Linked is the bes

        ll.remove("10");//removing single item

         System.out.println(ll);
        ll.removeAll(al);//removing multiple items

         System.out.println(ll);
         
         

         //Linked list is good at insertion and deletion but bad at searching and accessing elements because it is not stored in contiguous memory locations 
         // and it has to traverse the list to find the element but arraylist is good at searching and accessing elements because it is stored in contiguous memory locations
         //  and it can access the element directly using index but bad at insertion and deletion because it has to shift the elements to insert or delete an element
        
         //LL is not syncronized because it is not a legacy class and it is not thread safe but it is recommended to use linked list in multithreaded environment
         //  because it has better performance than vector due to lack of synchronization
    }
}