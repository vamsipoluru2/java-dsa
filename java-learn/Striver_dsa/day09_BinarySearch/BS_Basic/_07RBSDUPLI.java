public class _07RBSDUPLI {
   // search in rotated sorted array with duplicates and return true if found else false
    
    public static void main(String[] args) {
        int[] arr = {3,3,1,3,3,3,3}; 
        int target = 3;

        System.out.println("Index: " + search(arr, target));
    }

        static boolean search(int [] arr,int target){
            //we haver to find which part is sorted and then we can apply binary search on that part
            int low=0;
            int high=arr.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==target)return true;
                if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                        low++;
                        high--;
                        continue;
                    }
                //identify which part is sorted
                if(arr[low]<=arr[mid]){//left ahlf sorted
                    if(target>=arr[low] && target<arr[mid]){
                        high=mid-1;
                    }else low=mid+1;
                }else{//right half sorted
                    if(target>arr[mid] && target<=arr[high]){
                        low=mid+1;
                    }else high=mid-1;
                }
            
            }
            return false;
        }
    }

