import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamOp {

    public static void main(String[] args) {

        // Stream source: an immutable list. Call .stream() on it to start a pipeline.
        List<Integer> numbers = List.of(1, 4, 3, 8, 0, 4, 7);

        // ------------------------------------------------------------------
        // 1. Predicate: filter even numbers and count them
        // ------------------------------------------------------------------
        // Predicate<T>: takes a value, returns boolean. Method: boolean test(T t).
        // Use it to decide yes or no.
        // filter(), anyMatch(), allMatch(), noneMatch() take a Predicate.
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
        };

        // Same thing with a lambda:
        // long count = numbers.stream().filter(t -> t % 2 == 0).count();

        long evenCount = numbers.stream()   // source
                .filter(isEven)             // intermediate op: keeps even numbers only
                .count();                   // terminal op: counts what is left
        System.out.println("total no of even numbers is " + evenCount);

        // ------------------------------------------------------------------
        // 2. Print the even numbers in sorted order
        // ------------------------------------------------------------------
        // For descending order use: sorted(Comparator.reverseOrder())
        numbers.stream()
                .filter(t -> t % 2 == 0)        // intermediate: Predicate as lambda
                .sorted()                       // intermediate: natural (ascending) order
                .forEach(System.out::println);  // terminal: Consumer prints each element

        // map(): converts data from one type/value to another. Here it squares each number.
        // numbers.stream().map(t -> t * t).forEach(System.out::println);

        System.out.println("***************");

        // ------------------------------------------------------------------
        // 3. Function: square the even numbers, print them in sorted order
        // ------------------------------------------------------------------
        // Function<T, R>: takes T, returns R. Method: R apply(T t). Used by map().
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * t;
            }
        };

        // Version A: map() uses the Function object above.
        // peek() is a Consumer. It prints each squared value as it passes through.
        // peek is intermediate: it runs only because count() (terminal) pulls elements through.
        int count1 = (int) numbers.stream()
                .filter(t -> t % 2 == 0)
                .sorted()
                .map(square)
                .peek(System.out::println)
                .count();
        System.out.println("total no of even numbers is " + count1);

        // Version B: same pipeline, map() uses a lambda instead of the Function object.
        int count2 = (int) numbers.stream()
                .filter(t -> t % 2 == 0)
                .sorted()
                .map(t -> t * t)
                .peek(System.out::println)
                .count();
        System.out.println("total no of even numbers is " + count2);
    }
}


/*
 * ======================= NOTES: functional interfaces =======================
 *
 * Predicate<T>: takes a value, returns boolean. Method: boolean test(T t).
 *   Use it to decide yes or no. filter(), anyMatch(), allMatch(), noneMatch() take a Predicate.
 *
 *     Predicate<Integer> isEven = n -> n % 2 == 0;
 *     list.stream().filter(isEven).toList();       // keeps only even numbers
 *
 * Consumer<T>: takes a value, returns nothing (void). Method: void accept(T t).
 *   Use it to do something with each element: print, save, modify external state.
 *   forEach(), peek(), ifPresent() take a Consumer.
 *
 *     Consumer<Integer> printer = n -> System.out.println(n);
 *     list.stream().forEach(printer);              // prints every element
 *
 *   forEach(System.out::println) already passes a Consumer.
 *
 * | Interface      | Method  | Input | Output  | Used in                 |
 * |----------------|---------|-------|---------|-------------------------|
 * | Predicate<T>   | test    | T     | boolean | filter, anyMatch        |
 * | Consumer<T>    | accept  | T     | void    | forEach, peek           |
 * | Function<T,R>  | apply   | T     | R       | map                     |
 * | Supplier<T>    | get     | none  | T       | generate, orElseGet     |
 * | Comparator<T>  | compare | T, T  | int     | sorted, max             |
 *
 * Memory trick:
 *   - Predicate asks a question: "is it true?"
 *   - Consumer eats the value and gives nothing back.
 *   - Function transforms the value.
 *   - Supplier produces a value from nothing.
 *
 * Comparator is also a functional interface. It takes two values and returns
 * negative, zero, or positive to say which comes first.
 *
 * Chaining:
 *   Consumer:  c1.andThen(c2)  runs c1, then c2, on the same element.
 *   Predicate: p1.and(p2), p1.or(p2), p1.negate()
 *
 * Why filter needs a Predicate: it must decide keep or drop per element,
 *   and only a boolean can say that.
 * Why forEach needs a Consumer: it is a terminal operation that only performs
 *   an action and returns nothing.
 */
