package MultipleInhertance;

public class Test implements A, B {

    @Override
    public void show() {
        System.out.println("I am implementing show() from both interfaces");
    }

    public void add() {
        System.out.println("Additional method in Test class");
    }
}
