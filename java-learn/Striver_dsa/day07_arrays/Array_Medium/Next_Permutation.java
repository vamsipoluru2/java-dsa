import java.util.Arrays;

public class Next_Permutation {

    public static void main(String[] args) {

     int[] nums = {2, 1, 5, 4, 3, 0, 0};

    System.out.println("Before: " + Arrays.toString(nums));

    nextPermutation(nums, nums.length);

    System.out.println("After:  " + Arrays.toString(nums));
}

    static void nextPermutation(int[] nums, int n) {

    int index = -1;

    // Step 1: Find the first decreasing element from the right
    for (int i = n - 2; i >= 0; i--) {

        if (nums[i] < nums[i + 1]) {
            index = i;
            break;
        }
    }

    // If no decreasing element is found,
    // the array is the last permutation
    if (index == -1) {
        Arrays.sort(nums);
        return;
    }

    // Step 2: Find the smallest element greater than nums[index]
    // from the right side
    for (int i = n - 1; i > index; i--) {

        if (nums[i] > nums[index]) {

            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            break;
        }
    }

    // Step 3: Reverse the remaining elements
    // to get them in ascending order
    int left = index + 1;
    int right = n - 1;

    while (left < right) {

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++;
        right--;
    }
}
} 