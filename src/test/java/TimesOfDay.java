import java.time.LocalTime;

public class TimesOfDay {

    public static void main(String[] args) {
        LocalTime actualTime = LocalTime.now();
        LocalTime beginNightTime = LocalTime.of(21, 0);
        LocalTime beginMorningTime = LocalTime.of(9, 0);
        LocalTime beginDayTime = LocalTime.of(13, 0);
        LocalTime beginEveningTime = LocalTime.of(17, 0);

        if (actualTime.isAfter(beginMorningTime) && actualTime.isBefore(beginDayTime) || actualTime.equals(beginMorningTime)) {
            System.out.println(actualTime + " утро");
        }

        if (actualTime.isAfter(beginDayTime) && actualTime.isBefore(beginEveningTime) || actualTime.equals(beginDayTime)) {
            System.out.println(actualTime + " день");
        }

        if (actualTime.isAfter(beginEveningTime) && actualTime.isBefore(beginNightTime) || actualTime.equals(beginEveningTime)) {
            System.out.println(actualTime + " вечер");
        }

        if (actualTime.isAfter(beginNightTime) || actualTime.equals(beginNightTime)) {
            System.out.println(actualTime + " ночь");
        }


    }
}

