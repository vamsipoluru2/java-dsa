import java.util.ArrayList;
public class leetcode17 {
    public static void main(String[] args) {
        pad("","12");
        System.out.println("");
        System.out.println(pad2("","12"));
        System.out.println(padcount("","12"));


    
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }
        int digit=up.charAt(0)-'0';//this will convert '2' to 2
        for(int i=((digit-1)*3);i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }

     }
     static ArrayList<String>  pad2(String p,String up){
        
        if(up.isEmpty()){

            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';//this will convert '2' to 2
        ArrayList<String> list=new ArrayList<>();
        for(int i=((digit-1)*3);i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(pad2(p+ch,up.substring(1)));
            
        }
        return list;

     }

     static int padcount(String p,String up) {
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-0;

        for(int i=((digit-1)*3);i<digit*3;i++){
            char ch=(char)('a'+i);
            count=count+padcount(p+ch,up.substring(1));
        }
        return count;
    }
    
}
