import java.util.Scanner;

public class WeekExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine().toLowerCase();

        if (day.equals("monday") ||
            day.equals("tuesday") ||
            day.equals("wednesday") ||
            day.equals("thursday") ||
            day.equals("friday")) {

            System.out.println(day + " is a Weekday");

        } else if (day.equals("saturday") ||
                   day.equals("sunday")) {

            System.out.println(day + " is a Weekend");

        } else {

            System.out.println("Invalid day");
        }

        sc.close();
    }
}