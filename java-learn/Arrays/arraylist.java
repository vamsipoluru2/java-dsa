import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(10);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        list.add(160);

        //or use for loop and scanner to take user input

        System.out.println(list.contains(110));
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.size());

       ArrayList<ArrayList<Integer>>lists=new ArrayList<>(10);
       
       for(int j=0;j<3;j++){
        lists.add(new ArrayList<>());//adding in the arraylist
        }

       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
       lists.get(i).add(in.nextInt());//getting from the array
       }
    }

    System.out.println(lists);

    in.close();


    }
}
