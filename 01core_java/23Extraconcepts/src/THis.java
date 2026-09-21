public class THis {

    int age = 25;

    void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        THis e1 = new THis();

        System.out.println(e1.age);  // 25

        e1.setAge(80);

        System.out.println(e1.age);  // 80
    }
}
