import java.util.ArrayList;

public class permutaion {
    public static void main(String[] args) {
        permutaions("", "abc");
        System.out.println(" ");
        System.out.println(permutaionsArraylist("", "abcd"));    
        System.out.println(permutaionscount("", "abcd"));    

    }
    // int digit=up.CharAt(0)-'0';//this will convert '2' to 2 char to integer

    static void permutaions(String p,String up) {//p=processed up is unprocessed
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutaions(f+ch+s,up.substring(1));


        }
    }
    
    static ArrayList<String>  permutaionsArraylist(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutaionsArraylist(f+ch+s,up.substring(1)));



        }
        return ans;
    }
    //count

    static int permutaionscount(String p,String up) {
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count =count+permutaionscount(f+ch+s,up.substring(1));


        }
        return count;
    }
    
    
}
