// package day9 recurssion.day9-4 string_recurr;
// import java.util.Arrays;
import java.util.ArrayList;
public class subset_recurr {
 public static void main(String[] args) {
    //  String str="ABC";
    //  subseq("","abc");
    System.out.println(subseqret("", "abc"));//not printig in function so
    // subseqAscii("","abc");
    System.out.println(subseqretAscii("", "abc"));//not printig in function so

}  
static void  subseq(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }

    char ch=up.charAt(0);
    subseq(p+ch,up.substring(1));//substring
    subseq(p,up.substring(1));//ignore case

}
//samee in recur in linear search refer it dAY9-2 reccur
static ArrayList<String> subseqret(String p,String up){
    
    ArrayList<String> list=new ArrayList<>();
    if(up.isEmpty()){
        list.add(p);
        
        return list;
    }

    char ch=up.charAt(0);
    ArrayList<String> left= subseqret(p+ch,up.substring(1));//substring
    ArrayList<String> right=subseqret(p,up.substring(1));//ignore case
    left.addAll(right);//adding in the left and right sid ein list
    return left;

}
static void  subseqAscii(String p,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }

    char ch=up.charAt(0);
    subseqAscii(p+ch,up.substring(1));//substring
    subseqAscii(p,up.substring(1));//ignore case
    subseqAscii(p+(ch+0),up.substring(1));//ascii values returning
}
static ArrayList<String> subseqretAscii(String p,String up){
    
    ArrayList<String> list=new ArrayList<>();
    if(up.isEmpty()){
        list.add(p);
        
        return list;
    }

    char ch=up.charAt(0);
    ArrayList<String> first= subseqretAscii(p+ch,up.substring(1));//substring
    ArrayList<String> second=subseqretAscii(p,up.substring(1));//ignore case
    ArrayList<String> third=subseqretAscii(p+(ch+0),up.substring(1));//ignore case

    first.addAll(second);//adding in the left and right sid ein list
    first.addAll(third);
    return first;

}
}
