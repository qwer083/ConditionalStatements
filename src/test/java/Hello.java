import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Hello {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int hour = now.getHour();


        if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.TUESDAY || dayOfWeek == DayOfWeek.WEDNESDAY || dayOfWeek == DayOfWeek.THURSDAY || dayOfWeek == DayOfWeek.FRIDAY) {

            if ((hour <= 8)) {
                System.out.println("Доброе утро");

                if (hour >= 8) {
                    System.out.println("Всё пропало ты проспал!");
                }
                if (hour >= 11) {
                    System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
                }
            }
        }

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            if (hour < 12) {
                System.out.println("Доброе утро!");
            }
            if (hour >= 12 && hour < 16) {
                System.out.println("Лучше поспать ещё");
            }
            if (hour >= 16 && hour < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            }
            if (hour >= 18) {
                System.out.println("Дааа, с режимом надо что-то делать");
            }
        }
    }
}
