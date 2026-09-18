
public class Slarg_sSmallinarray {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        System.out.println("Second Smallest: " + secondSmallest(arr));
        System.out.println("Second Largest: " + secondLargest(arr));
    }

    static int secondSmallest(int[] arr) {

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallest && arr[i] != smallest) {

                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    static int secondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    
}
