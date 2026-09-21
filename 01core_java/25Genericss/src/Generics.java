class Almond {
    String name = "Almond";
}

class Cashew {
    String name = "Cashew";
}

class Box<T> {

    T item;

    void put(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}

public class Generics {

    public static void main(String[] args) {

        // Box specifically for Almond
        Box<Almond> almondBox = new Box<>();

        almondBox.put(new Almond());

        Almond almond = almondBox.get();

        System.out.println("Almond Box: " + almond.name);


        // Box specifically for Cashew
        Box<Cashew> cashewBox = new Box<>();

        cashewBox.put(new Cashew());

        Cashew cashew = cashewBox.get();

        System.out.println("Cashew Box: " + cashew.name);
    }
}