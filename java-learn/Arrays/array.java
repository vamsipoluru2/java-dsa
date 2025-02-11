import java.util.Arrays;
import java.util.Scanner;
public class array {   
    
    public static void main(String[] args) {
        Scanner arry = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=arry.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        String[] str=new String[4];
        for(int j=0;j<str.length;j++){
            str[j]=arry.next();
        
    }
    System.out.println(Arrays.toString(str));
        str[2]="vamsi";// changing object of array
        System.out.println(Arrays.toString(str));

    arry.close();
 }
}
