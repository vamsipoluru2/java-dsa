import java.util.Arrays;

public class ReccInsertionsort {
    public static void main(String[] args) {
        int[] arr = {5, -66, 3, 2, 1};

        System.out.println(Arrays.toString(sort(arr)));
    }

        static int[] sort(int[] arr){
        recursiveInsertionSort(arr, 0);
        return arr;
    }

    
    static void recursiveInsertionSort(int[] arr,int n){
        if(n>=arr.length) return;

        int j=n;
        // this loop will check if the current element is smaller than the previous element and if it is smaller then we will swap the elements
        //  and keep checking until we reach the start of the array or until we find an element that is smaller than the current element
        while(j>0 && arr[j-1]>arr[j]){
            swap(arr,j-1,j);
            j--;// this will help us to keep checking the previous elements until we reach the start of the array or until we find an element that is smaller than the current element
        }
        recursiveInsertionSort(arr,n+1);
     }

        public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
