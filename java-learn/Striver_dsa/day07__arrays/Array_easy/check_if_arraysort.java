
public class check_if_arraysort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3,3, 4, 5};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]) {

            }
            else {
                return false;
            }
        }
        return true;
    }
    
}
