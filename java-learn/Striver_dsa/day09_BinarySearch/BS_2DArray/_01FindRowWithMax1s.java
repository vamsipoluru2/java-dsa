public class _01FindRowWithMax1s {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1}
        };

        System.out.println("Row with max 1s: " + rowWithMax1sbrute(matrix,matrix.length));
        System.out.println("Row with max 1s: " + rowWithMax1sBs(matrix,matrix.length,matrix[0].length));
    }

    static int rowWithMax1sbrute(int[][] arr,int n){
        int maxcnt=-1;
        int index=-1;

        for(int i=0;i<n;i++){
            int countrow=0;
            for(int j=0;j<n;j++){
                countrow+=arr[i][j];
                if(countrow>maxcnt){
                    maxcnt=countrow;
                    index=i;
                }
            }
        }
        return index;
    }
    static int rowWithMax1sBs(int[][] arr,int n,int m){

        int maxcnt=0;//due to a test case where all rows have 0s, we need to initialize maxcnt to 0 instead of -1
        int index=-1;

        for(int i=0;i<n;i++){
            int coun_ones=m-firstOccurrence(arr[i],1);
            if(coun_ones>maxcnt){
                maxcnt=coun_ones;
                index=i; 
            }
        }
        return index;
        

    }

    static int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }
    
}
