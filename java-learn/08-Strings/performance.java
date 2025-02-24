public class performance {
public static void main(String[] args) {
    String series="";
    for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        series+=ch;
    // System.out.print(ch);   
}
System.out.println(series);//adding to string and return it
    //new obj is created every time "abc"+'d' memory waste age a,ab,abc,...
    //String cant be or allowed to modifi the value it is immutable

    //we need a data type it can allow us to change the value in its own object it is string builder 
}
}
