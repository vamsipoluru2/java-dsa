import java.util.ArrayList;

public class fasctorsofnum {
    public static void main(String[] args) {
        int num=20;
        // factors(num);
        // factor2(num);
        factor3(num);
       
        
    }
    // sqrt(N)
    static void factor2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                System.out.print(i+"  ");

            }
            else{
                    System.out.print(1+" "+n/i+" ");
                }
            }
        }
    }
    static void factor3(int n){
        ArrayList<Integer> list=new ArrayList<>();  
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                System.out.print(i+"  ");

            }
            else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }





    //o(N)
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i);
            }
        }
    }
    
}
