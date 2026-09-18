
import java.util.*;

public class VectorPractice {

    public static void main(String[] args) {

        //vector doubly increases its size when it reaches its capacity
        //advantage of vector over array is that we can add or remove elements from vector without worrying about the size of vector
        //disadvantage of vector is that it is synchronized, which means that it is thread
        //the problem in array of fixed is overcome by vector because vector is dynamic array which can grow and shrink in size


        //creation of vector
        //Vector<Object> v = new Vector<Object>(); 
        Vector<String>  v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add(0,"C");//index 0 is the first position



        System.out.println(v);
        System.out.println("size of vector: "+v.size());
        System.out.println("capacity of vector: "+v.capacity());

        //Additionn
        Vector<String> v1 = new Vector<>();
        v1.add("D");
        v1.add("E");
        v1.add("F");

        Vector<String> v2 = new Vector<>();
        v2.add("G");
        v2.add("H");

        System.out.println("V1 before adding V2: "+v1);

        
        for(int i=0; i<v2.size(); i++){
            v1.add(v2.get(i));//it will add the elements of v2 to v1
        }
        System.out.println("V1 after adding  V2: "+v1);

        v1.addAll(v2);//it will add all the elements of v2 to v1
        System.out.println("V1 after adding  V2 using addAll method: "+v1);
        v1.addAll(1,v2);//it will add all the elements of v2 to v1 at index 0
        System.out.println("V1 after adding  V2 using addAll method at index 0: "+v1);

        // removal
        v1.remove("D");//it will remove the element D from v1
        System.out.println("V1 after removing D: "+v1);

        
        // v1.clear();//it will remove all the elements from v1
        // System.out.println("V1 after clearing: "+v1);
         
        // Verfication
        System.out.println(v1.contains("E"));//it will return true if v1 contains E
        System.out.println(v1.containsAll(v2));//it will return true if v1 contains all the elements of v2

        //updation
        v1.set(1,"X");//it will set the element at index 1 to X
        System.out.println("V1 after setting index 1 to X: "+v1);

        System.out.println(v1.get(1));//it will return the element at index 1
        System.out.println(v1.indexOf("X"));//it will return the index of X

        Object[] arr = v1.toArray();//it will convert the vector to array
        System.out.println("Array: "+Arrays.toString(arr)); 

                // Array to Vector conversion
        Integer[] arr2 = {1, 2, 3, 4, 5};

        Vector<Integer> v3 = new Vector<>(Arrays.asList(arr2));

        int sum = 0;

        for (Integer num : v3) {
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println("\nSum = " + sum);
        }
        //vector is good at searching and accessing elements because it is stored in contiguous memory locations and it can access the element directly using index
        
        //is vector syncronized? yes vector is synchronized because it is a legacy class and it is thread safe but it is not recommended to use vector in multithreaded environment
}