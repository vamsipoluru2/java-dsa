public class Switchex {
    //new switch 
    public static void main(String[] args) {

        int number = -10;

        // Switch expression
        // Switch expressions work from Java 14+

        String result = "";

        result = switch (Integer.compare(number, 0)) {

            case -1 -> "negative";

            case 0 -> "zero";

            case 1 -> {
                if (number % 2 == 0)
                    yield "positive & even";
                else
                    yield "positive & odd";
            }

            default -> throw new IllegalArgumentException(
                    "Unexpected value: " + Integer.compare(number, 0)
            );
        };

        System.out.printf(
                "The given number %d is %s%n",
                number,
                result
        );


        // New switch statement style

        switch (Integer.compare(number, 0)) {

            case -1 -> System.out.println("Negative");
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Positive");

        }


        // Old switch statement style

        switch (Integer.compare(number, 0)) {

            case -1:
                System.out.println("Negative");
                break;

            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("Positive");
                break;
        }

         // Switch with String

        String s = "wed";

        switch (s) {

            case "mon", "tue", "wed", "thu", "fri" ->
                System.out.println("Uff, its a weekday!");

            case "sat", "sun" ->
                System.out.println("Yayy, its a weekend!");

            default ->
                throw new IllegalArgumentException(
                        "Unexpected value: " + s
                );
        }
    }
}