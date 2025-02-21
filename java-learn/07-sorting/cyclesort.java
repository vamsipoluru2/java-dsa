// package day5_1 sortingkunal;
import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};//every index at value -1
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;//vlue+1 for only 1-N range numbers

            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
    }

    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
    
    
}
