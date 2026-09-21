public class ENUMs {

    public static void main(String[] args) throws Exception {

    enum Day { 
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
     int index;//make sure to add final for var in enum
    private Day(){

    }

    private Day(int index){
        this.index=index;
    }
}
            //for enum we can create obj 
            //construtor shold be private to use in side it 
            //enum is  calss annd inside things arwe obj so if you create constructoe then it will be called tose many obj times
            //if not constructor then it uses default constrocotr

        Day day = Day.SATURDAY;

        switch (day) {

            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                System.out.println("Weekday");

            case SATURDAY, SUNDAY ->
                System.out.println("Weekend");
        }

         if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println("Weekend");
        }
        else if (day == Day.MONDAY ||
                 day == Day.TUESDAY ||
                 day == Day.WEDNESDAY ||
                 day == Day.THURSDAY ||
                 day == Day.FRIDAY) {
            System.out.println("Weekday");
        }
        else {
            throw new IllegalArgumentException(
                "Unexpected value: " + day
            );
        }

    }
}
