import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Foreach {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Queue<Integer> queue=new PriorityQueue<>(list);

        //for loop iss for iterating over the list using index
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n");


        //enchanced for loop is used to iterate over the list without using index
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println("\n");

        
        //foreach method is used here to iteareate over list 
        
        Consumer<Integer> con=new Consumer<Integer>(){
            public void accept(Integer i){
                System.out.print(i+" ");
            }
        };
        list.forEach(con);
        // func interface can use lamda exp
        // Consumer<Integer> con=(i)->System.out.print(i+" ");
        //simp lamda exp
        //list.forEach((i)->System.out.print(i+" "));
        queue.forEach((i)->System.out.print(i+" "));

        
        System.out.println("\n");


        //bicomsumer
        //Map is a biconsumer bcs it has key value pair
        Map<Integer,String> Students=new HashMap<>();
        Students.put(1,"John");
        Students.put(2,"Alice");
        Students.put(3,"Bob");

        BiConsumer<Integer,String> biCon=new BiConsumer<Integer,String>(){
            public void accept(Integer i,String k){
                System.out.print(i+" "+k+",");
            }
        };
        Students.forEach(biCon);
        //lamdaexp
        BiConsumer<Integer,String> biCon1=(i,k)->System.out.print(i+" "+k+",");
        Students.forEach(biCon1);

        //lamdaexp simp exp
        Students.forEach((i,k)->System.out.print(i+" "+k+","));
    }
}
 