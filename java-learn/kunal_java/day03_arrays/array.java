import java.util.Arrays;
import java.util.Scanner;
public class  array {
    
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

        reverse(str);
        System.out.println(Arrays.toString(str));// cant return arry

        System.out.println(Arrays.toString(str));
        str[2]="vamsi";// changing object of array
        System.out.println(Arrays.toString(str));

    arry.close();
 }

    static void reverse(String[] arry){
        int start = 0;
        int end = arry.length - 1;

        while (start < end) {
            swap(arry,start,end);
            start++;
            end--;

        }

    }static void swap(String[] arr,int index1 , int index2){
        String temp1 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp1;
    }
}
