import java.util.Arrays;

public class RecursiveBBsort {
     public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        recursiveBubbleSort(arr, arr.length);
        return arr;
    }

    static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: If the array size is 1, return
        if (n == 1) {
            return;
        }
        //one pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        // Largest element is fixed, recur for remaining array
        recursiveBubbleSort(arr, n - 1);

        }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
