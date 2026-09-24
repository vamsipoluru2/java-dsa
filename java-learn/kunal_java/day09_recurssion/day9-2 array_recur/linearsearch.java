import java.util.ArrayList;
public class linearsearch {
    
        public static void main(String[] args) {
            int[] arr={6,2,3,2,5,6,7,8,7};
            System.out.println(find(arr, 0,2));
            System.out.println(findindex(arr, 0,2));
            System.out.println(findindexlast(arr, arr.length-1,2));
            findallindex(arr, 0,2 );
            System.out.println(list);
            ArrayList<Integer> result = findallTindex(arr, 0,6 , new ArrayList<>());
            System.out.println(result); // Output: [1, 3, 5]
           
            System.out.println(findallTindex2(arr, 0,7 ));
        }
    
        static boolean find(int[] arr,int index,int target){//here true and  flase are  returning so boolean
            if(index == arr.length){
                return false;
    
            }
            return arr[index] ==  target  || find(arr, index+1, target);//here array and target are not changing only index is changing
    
        }

        static int findval(int[] arr,int val,int index){
            if(index==arr.length){
                return -1;

            }

            if(arr[index]==arr[val]){
                return arr[val];
            }
            return findval( arr, val, index+1);
        }

        static int findindex(int[] arr,int index,int target){
            if(index == arr.length){
                return -1;
    
            }
            if (arr[index] ==  target){
                return index;
            }
            return  findindex(arr, index+1, target);//here array and target are not changing only index is changing
    
        }

        static int findindexlast(int[] arr,int index,int target){//here it will reture first occurence of target from last
            if(index == -1){
                return -1;
    
            }
            if (arr[index] ==  target){
                return index;
            }
            return  findindexlast(arr, index-1, target);//here array and target are not changing only index is changing
    
        }

        static ArrayList<Integer> list = new ArrayList<>();
        static void findallindex(int[] arr,int index,int target){
            if(index == arr.length){
                return;
    
            }
            if (arr[index] ==  target){
                list.add(index);
            }
            findallindex(arr, index+1, target);
    
        }
        //returning array list
        static ArrayList<Integer> findallTindex(int[] arr,int index,int target,ArrayList<Integer> list){
            if(index == arr.length){
                return list;
            }
    
    
            if (arr[index] ==  target){
                list.add(index);
            }
            return findallTindex(arr, index+1, target,list);
                //if returntype is given add return
        }



         // with out passing the arguments of list
         static ArrayList<Integer> findallTindex2(int[] arr,int index,int target){
            ArrayList<Integer> list = new ArrayList<>();

            if(index == arr.length){
                return list;
            }
    
                // it will contain answer for that function call only
            if (arr[index] ==  target){
                list.add(index);
            }
            // adding all lists in array l;ists
            ArrayList<Integer> ansFrombelowcall=findallTindex2(arr, index+1, target);
            list.addAll(ansFrombelowcall);
            return list;
        }


    }
    

