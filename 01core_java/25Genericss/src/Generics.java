class Almond {
    String name = "Almond";
}

class Cashew {
    String name = "Cashew";
}


// =========================
// GENERIC BOX
// =========================

class Box<T> {

    T item;

    void put(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}


// =========================
// GENERIC SWAP
// =========================

class Swap {

    public static <T> void swap(T[] arr, int i, int j) {

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


// =========================
// UPPER BOUND
// =========================

class Calculator {

    // T must be Number or a subclass of Number
    public static <T extends Number> double add(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }
}


// =========================
// LOWER BOUND
// =========================

class Printer {

    // List can accept Integer or any parent of Integer
    public static void addNumber(java.util.List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }
}


public class Generics {

    public static void main(String[] args) {

        // =========================
        // BOX
        // =========================

        Box<Almond> almondBox = new Box<>();
        almondBox.put(new Almond());

        System.out.println("Almond: " + almondBox.get().name);


        Box<Cashew> cashewBox = new Box<>();
        cashewBox.put(new Cashew());

        System.out.println("Cashew: " + cashewBox.get().name);


        // =========================
        // GENERIC SWAP
        // =========================

        Integer[] numbers = {10, 20};

        Swap.swap(numbers, 0, 1);

        System.out.println("\nInteger Swap:");
        System.out.println(numbers[0] + " " + numbers[1]);


        Boolean[] values = {true, false};

        Swap.swap(values, 0, 1);

        System.out.println("\nBoolean Swap:");
        System.out.println(values[0] + " " + values[1]);


        String[] names = {"Almond", "Cashew"};

        Swap.swap(names, 0, 1);

        System.out.println("\nString Swap:");
        System.out.println(names[0] + " " + names[1]);


        // =========================
        // UPPER BOUND
        // =========================

        System.out.println("\nUpper Bound:");

        System.out.println(
            Calculator.add(10, 20)
        );

        System.out.println(
            Calculator.add(10.5, 20.5)
        );


        // This would NOT work:
        // Calculator.add("10", "20");  // ❌
    }
}