import java.util.*;

public class SetP {
    public static void main(String[] args) {
    Set<Integer> hs=new HashSet<>();
    hs.add(10);
    hs.add(20);
    hs.add(1);
    hs.add(3);// it will add based on hashcode order
    //the order of the elements is not maintained in hashset because it uses hashcode to store the elements and it does not allow duplicate elements
    hs.add(10);// it will not add because it is duplicate element
    System.out.println(hs);
    hs.remove(1);//removing single item// pass data 
    System.out.println(hs);

    hs.contains(20);// it will return true because 20 is present in the set

    //retervial
    for(Integer element:hs){
        System.out.println(element);
    }

    //tree set is for sorted order and it duplicate is not allowed 
    TreeSet<Integer> ts=new TreeSet<>();
    ts.add(10);
    ts.add(20);
    ts.add(1);
    ts.add(3);
    // ts.add("10");//it stores elemet in sorted order but it will give class cast exception because it is trying to compare string with integer and it is not possible because they are different types of objects
    System.out.println(ts);// it will print in sorted order because it uses tree data structure to store the elements

    ts.remove(1);//removing single item// pass data
    System.out.println(ts);

    // same as hashset but it will maintain the order of the elements because it uses linked list to store the elements and it does not allow duplicate elements

    //there some methods extra
    //lowest element
    System.out.println(ts.first());
    //highest element
    System.out.println(ts.last());

    System.out.println(ts.subSet(3, 20));// it will return the subset of the elements between 3 and 20

    //linked hash set is for maintaining the order of the elements and it does not allow duplicate elements
    //tree set is for sorted order and it does not allow duplicate elements but it is not recommended to use tree set in multithreaded environment because it is not thread safe but it is recommended to use linked hash set in multithreaded environment because it has better performance than tree set due to lack of synchronization
    //hash set is for storing the elements in hashcode order and it does not allow duplicate elements but it is not recommended to use hash set in multithreaded environment because it is not thread safe but it is recommended to use linked hash set in multithreaded environment because it has better performance than hash set due to lack of synchronization
     
     
  }

}
