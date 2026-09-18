package MultipleInhertance;

public class Main {
    public static void main(String[] args) {

        Test t = new Test();

        System.out.println("Using Test Reference:");
        t.show();
        t.add();

        System.out.println();

        A a = new Test();
        System.out.println("Using A Reference:");
        a.show();

        System.out.println();

        B b = new Test();
        System.out.println("Using B Reference:");
        b.show();
    }
}
