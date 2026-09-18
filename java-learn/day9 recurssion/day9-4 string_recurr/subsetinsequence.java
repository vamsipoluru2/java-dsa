import java.util.List;
import java.util.ArrayList;
public class subsetinsequence {
    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        // List<List<Integer>> subsets = subset(arr);
        // for (List<Integer> subset : subsets) {
        //     System.out.print(subset+",");
        // }
        int[] arr = {1,2,2};
        List<List<Integer>> subsets = subsetduplicate(arr);
        for (List<Integer> subset : subsets) {
            System.out.print(subset+",");
        }
        
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n=outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    //duplicate in the array 
    static List<List<Integer>> subsetduplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end=0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            //if current and position element is same s=e+1
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;

            int n=outer.size();
            for(int j=start; j<n; j++){

                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
