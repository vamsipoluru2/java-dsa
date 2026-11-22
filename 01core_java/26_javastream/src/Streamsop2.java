import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streamsop2 {
    public static void main(String[] args) {
        IntStream.of(1, 4, 3, 8, 0, 4, 7)
                .filter(t -> t % 2 == 0)        // intermediate: Predicate as lambda
                .sorted()                       // intermediate: natural (ascending) order
                .forEach(System.out::println);  // terminal: Consumer prints each element 

                System.out.println("***************");
    // .of will add only the values you specify. If you want a range of values, use .range or .rangeClosed.
    IntStream.range(1, 10).forEach(System.out::println); // prints 1 to 9 incrementing by 1 
    IntStream.rangeClosed(1, 10).forEach(System.out::println); // prints 1 to 10

    System.out.println("***************");
    // stream source should be created via a condition we use iterators to create a stream source. 
    // For example, we can use IntStream.iterate() to create an infinite stream of even numbers starting from 0.
    // We can then limit the stream to the first 10 even numbers and print them.
    IntStream.iterate(0, n -> n + 2) // infinite stream of
              .limit(10)// limit to first 10 even numbers
              .forEach(System.out::println); // prints 0, 2, 4, 6, 8, 10, 12, 14, 16, 18

              System.out.println("***************");
              //this is an example of how to use iterate  The first argument is the seed value,
              // the second argument is a predicate that determines when to stop, and the third argument is a function that generates the next value in the stream.
    IntStream.iterate(1,n->n<50,n->n+3)//jus like for loop we can use iterate to create a stream of odd numbers starting from 1.
            .skip(5)//skip the first 5 odd numbers and limit to the next 10 odd numbers
            .limit(10)
            .forEach(System.out::println);    
            
            System.out.println("***************");
    //supplier supplies a value, takes nothing. Method: T get().
    // only useful for random values or constant values
    IntStream.generate(() -> (int) (Math.random() * 100)) // infinite stream of random numbers between 0 and 99
            .distinct() // intermediate: keeps only distinct values
            .limit(10) // limit to first 10 random numbers
            .sorted() // intermediate: natural (ascending) order
            .forEach(System.out::println); // prints 10 random numbers 

            System.out.println("***************");
            // Intstreamconcat
    IntStream stream1 = IntStream.of(1, 2, 3);
    IntStream stream2 = IntStream.of(4, 5, 6);
    IntStream.concat(stream1, stream2)
            .forEach(System.out::println); // prints 1, 2, 3, 4, 5, 6
    // or in form of array
    int [] arr = IntStream.concat(IntStream.of(1, 2, 3), IntStream.of(4, 5, 6)).toArray();
    System.out.println(Arrays.toString(arr)); // prints [1, 2, 3, 4, 5, 6]
    //to array is terminal op

    System.out.println("***************");
    //generate a list and convert it to an array
    List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 3);
    Object[] arr2=list.stream().distinct().sorted().toArray();//it will be the type object array because we are using stream of list of integers and distinct will return a stream of distinct integers and toArray will return an array of objects.
    System.out.println(Arrays.toString(arr2)); // prints [1, 2, 3, 4, 5]

    //Strings stream source
    System.out.println("***************");
    String s="Java is a programming language. \nJava is also a platform. \nJav is used to develop applications for desktop, mobile, and web.";
    s.lines()//stream source is string and lines() will return a stream of strings
            .filter(t->t.contains("Java"))//intermediate op: filter the lines that contain "Java"
            .forEach(System.out::println);//terminal op: print the lines that contain "Java"
    //convert primitivve stream to object stream mapToObj() is used to convert primitive stream to object stream
    System.out.println("***************");
    s.chars()//stream source is string and chars() will return a stream of integers
            .mapToObj(c->(char)c)//intermediate op: convert integer to character
            .filter(c->"aeiou".indexOf(c)<0)//intermediate op: filter the characters that are vowels
            .forEach(System.out::println);//terminal op: print the characters
     
}
}