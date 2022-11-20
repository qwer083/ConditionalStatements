import java.time.LocalTime;

public class TimesOfDayWithError {


    public void defineDayTimeByHour(int hour) {
        if (hour > 23) {
            System.out.println("время суток нужно ввести правильно");
        }
        if (hour < 0) {
            System.out.println("следует вернуться с другой планеты на Землю");
        }

        if (hour >= 0 && hour <= 5) {
            System.out.println("");
        }

        if (hour > 5 && hour <= 11) {
            System.out.println("");
        }


        if (hour > 11 && hour <= 16) {
            System.out.println("");
        }

        if (hour > 16 && hour <= 23) {
            System.out.println("");
        }


    }


    public static void main(String[] args) {



    }
}
