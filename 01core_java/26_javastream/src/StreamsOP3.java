import java.util.Optional;
import java.util.stream.Stream;

public class StreamsOP3 {
    public static void main(String[] args) {
        //stream builders
        Stream<Integer> ss=Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                 .build();// creates a stream of 1, 2, 3
                
                 ss.filter(t -> t % 2 == 0)        // intermediate: Predicate as lambda
                .forEach(System.out::println);  // terminal: Consumer prints each element

                //may be the data will not come form the intermediate operations so we put optional to handle the null values. Optional is a container object which may or may not contain a value.
                Integer[] arr= {1,2,3,4,5,6};
                Optional<Integer> op=Stream.of(arr)
                .filter(t -> t % 2 == 0)        // intermediate: Predicate as lambda
                .findFirst();// terminal: returns an Optional containing the first even number, or empty if none found

                System.out.println(op.orElse(-1));// prints the first even number, or -1 if none found
            }
    
}
