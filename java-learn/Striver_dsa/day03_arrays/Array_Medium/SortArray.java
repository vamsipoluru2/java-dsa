import java.util.Arrays;

public class SortArray{
    public static void main(String[] args) {
          int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));

        sort012(nums, nums.length);

        System.out.println("After sorting:  " + Arrays.toString(nums));

         // Optimal approach input
        int[] numsOptimal = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        System.out.println("\nOptimal Approach");
        System.out.println("Before sorting: " + Arrays.toString(numsOptimal));

        Optimalsort012(numsOptimal);

        System.out.println("After sorting:  " + Arrays.toString(numsOptimal));
    }

   static void sort012(int[] nums,int n) {

    int count0 = 0;
    int count1 = 0;
    // int count2 = 0;

    // Count 0s, 1s and 2s
    for (int num : nums) {

        if (num == 0) {
            count0++;
        } else if (num == 1) {
            count1++;
        } else {
            count2++;
        }
    }

    // Overwrite the array
    // Fill 0s
    for (int i = 0; i < count0; i++) {
        nums[i] = 0;
    }

    // Fill 1s
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }

        // Fill 2s
        for (int i = count0 + count1; i < n; i++) {
            nums[i] = 2;
    }
}

    static void Optimalsort012(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                // 1 is already in its correct region
                mid++;

            } else {

                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}





