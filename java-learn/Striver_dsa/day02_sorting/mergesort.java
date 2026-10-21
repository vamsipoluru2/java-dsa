package Striver_dsa.day05_sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        // Sort left half
        sort(arr, low, mid);

        // Sort right half
        sort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Compare elements from both halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;

            } else {

                temp.add(arr[right]);
                right++;
            }
        }

        // Remaining elements from left half
        while (left <= mid) {

            temp.add(arr[left]);
            left++;
        }

        // Remaining elements from right half
        while (right <= high) {

            temp.add(arr[right]);
            right++;
        }

        // Put temp back into original array
        for (int i = low; i <= high; i++) {

            arr[i] = temp.get(i - low);
        }
    }
}