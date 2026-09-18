import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistPractise {

    public static void main(String[] args) {

        // Array to ArrayList Conversion
        Integer[] arr = {3, 4, 5, 6, 7};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));

        // Addition
        al.add(1);           // add at end
        al.add(0, 2);        // add at specific index
        // al.add(null);         // add null

        System.out.println("After Additions: " + al);

        // Size
        System.out.println("Size: " + al.size());

        // Accessing Elements
        System.out.println("Element at index 2: " + al.get(2));

        // Updating Elements
        al.set(1, 100);
        System.out.println("After set(): " + al);

        // Searching
        System.out.println("Contains 5? " + al.contains(5));
        System.out.println("Index of 5: " + al.indexOf(5));
        System.out.println("Last Index of 5: " + al.lastIndexOf(5));

        // Removal
        al.remove(Integer.valueOf(5)); // remove object
        System.out.println("After removing 5: " + al);

        al.remove(0); // remove by index
        System.out.println("After removing index 0: " + al);

        // Another ArrayList
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(30);

        // addAll()
        al.addAll(al2);
        System.out.println("After addAll(): " + al);

        // containsAll()
        System.out.println("Contains all elements of al2? "
                + al.containsAll(al2));

        // Iteration - For Loop
        System.out.print("For Loop: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        // Enhanced For Loop
        System.out.print("Enhanced For Loop: ");
        for (Integer num : al) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterator
        System.out.print("Iterator: ");
        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(al);
        System.out.println("Sorted List: " + al);

        // Reverse
        Collections.reverse(al);
        System.out.println("Reversed List: " + al);

        // Maximum & Minimum
        System.out.println("Maximum: " + Collections.max(al));
        System.out.println("Minimum: " + Collections.min(al));

        // Convert ArrayList to Array
        Object[] array = al.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // isEmpty()
        System.out.println("Is Empty? " + al.isEmpty());

        @SuppressWarnings("unchecked")
        // Clone
        ArrayList<Integer> copy =
                (ArrayList<Integer>) al.clone();

        System.out.println("Cloned List: " + copy);

        // Clear
        copy.clear();
        System.out.println("After clear(): " + copy);

        // Sum of Elements
        int sum = 0;

        for (Integer num : al) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }

    //Array list is good at searching and accessing elements because it is stored in contiguous memory locations and it can access the element directly using index 
    // but bad at insertion and deletion because it has to shift the elements to insert or delete an element

    //array list is syncronized? no array list is not syncronized because it is not a legacy class and it is not thread safe but it is recommended to use array list in multithreaded 
    // environment because it has better performance than vector due to lack of synchronization
}