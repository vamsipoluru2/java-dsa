import java.util.Arrays;

public class intersectionofArray {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        System.out.println(Arrays.toString(intersectionOptimal(arr1, arr2)));
    }

    static int[] intersection(int[] arr1, int[] arr2) {

        int[] ans=new int[Math.min(arr1.length, arr2.length)];

        int[] visited=new int[arr2.length];
            
        int k=0;

        for(int i=0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]&&visited[j]==0){
                    ans[k]=arr1[i];
                    visited[j] = 1;
                    k++;//incresing the k the ans array
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
    int[] result = new int[k];

    for (int i = 0; i < k; i++) {
        result[i] = ans[i];
    }
    return result;

    }

    static int[] intersectionOptimal(int[] arr1, int[] arr2) {

    int i = 0;
    int j = 0;

    int[] ans = new int[Math.min(arr1.length, arr2.length)];
    int k = 0;

    while (i < arr1.length && j < arr2.length) {

        if (arr1[i] < arr2[j]) {
            i++;
        }
        else if (arr2[j] < arr1[i]) {
            j++;
        }
        else {
            // Both are equal
            ans[k] = arr1[i];
            k++;

            i++;
            j++;
        }
     }
        return Arrays.copyOf(ans, k);//ro eleminate extra apace

    }
}
