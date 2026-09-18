package day12_oops.oop2.staticExample2;
class Test{
    static String name;//

    public  Test(String name){//constructor to take name
        Test.name=name;// for static use class name
    }
}
public class innercalss2 {
    public static void main(String[] args) {
        Test a= new Test("kunal");//obj creation
        Test b=new Test("rahul");


        System.out.println(a.name);//rahul
        System.out.println(b.name);//rahul due to static string first cahnged to kunal
        // then after refrenced to rahul
    }
}