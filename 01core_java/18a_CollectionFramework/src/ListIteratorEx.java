import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<>();
        l.add(10);
        l.add(22.6);
        l.add("Hello");
        l.add(null);
        l.add("Stru");

        ListIterator<Object> i = l.listIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("===============");

        i.add("NewElement");
        i.previous();
        i.set("UpdatedElement");

        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }

        System.out.println("===============");

        while (i.hasNext()) {
            System.out.println(i.nextIndex() + " -> " + i.next());
        }
    }
}
