public class _01PeakInArray {
    public static void main(String[] args) {

        int[] arr = {1, 5,1,2, 1};

        int index = findPeak(arr, arr.length);

        System.out.println("Peak Element: " + arr[index]);
        System.out.println("Peak Index: " + index);
    }

    static int findPeak(int[] arr,int n){
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1;int high=n-2;
        while(low<=high){ 
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else high=mid-1;//peak is at left sde
        }
        return -1;
    } 
    static int findPeak(int[] arr) {

    int low = 0;
    int high = arr.length - 1;

    while (low < high) {

        int mid = low + (high - low) / 2;

        if (arr[mid] > arr[mid + 1]) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }

    return low;
}
}
