import java.util.List;
import java.util.function.Predicate;

public class StreamOp {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,4,3,8,0,4,7);
        //intermidate op 
        Predicate<Integer> pred=new Predicate<Integer>(){
            @Override 
            public boolean test(Integer t){
                return t%2==0;
            }
        };

         //or long count=numbers.stream().filter(t -> t%2==0).count();
        long  count=numbers.stream().filter(pred).count();//source
        //to filter the even numbers only
        System.out.println("total no of even numbers is "+count);

        //to show what are those numbers
        numbers.stream().filter(t -> t%2==0).sorted().forEach(System.out::println);

    }
}
