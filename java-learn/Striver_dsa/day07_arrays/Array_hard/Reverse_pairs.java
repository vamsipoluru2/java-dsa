import java.util.ArrayList;

public class Reverse_pairs {
     public static void main(String[] args) {
        int[] arr1={5,3,2,4,1};
        int[] arr = {5, 3, 2, 4, 1};

        System.out.println("Brute: " + CountBrute(arr1, arr1.length));
        System.out.println("Optimal: " + CountOpti(arr));
    }

    static int CountBrute(int[] arr,int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    static int CountOpti(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }


    static int mergeSort(int[] arr, int low, int high) {

        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);//cummlative arrays count 
        count += mergeSort(arr, mid + 1, high);
        count +=countPairs(arr,low,mid,high);//before merging this will happen
        merge(arr, low, mid, high);
        return count;
    }
    static int countPairs(int[] arr,int low,int mid,int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]> 2*arr[right]) right++;
            count+= (right-(mid+1));
        }
        return count;
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
