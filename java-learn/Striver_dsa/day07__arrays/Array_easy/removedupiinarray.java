

public class removedupiinarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

      System.out.println("Array after removing duplicates: " + removeDuplicates(arr));

    } 
    
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0; // Index of the next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {//checking next element is unique or not
                arr[j+1] = arr[i];
                j++;
            }
        }

        return j + 1; // Return the new length of the array
    }
}
