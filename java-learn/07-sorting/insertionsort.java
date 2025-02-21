// package day5_1 sortingkunal;
import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] array = {29, -10, 14, 37, -4};

        insertionSort(array);
        System.out.print("Sorted Array: "+Arrays.toString(array));
    }

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    // Function to swap elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
