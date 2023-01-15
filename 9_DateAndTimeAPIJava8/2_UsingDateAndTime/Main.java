import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        /*
         * Immutability with Java 8
         */

        // LocalDate
        LocalDate localDate = LocalDate.of(2022, Month.APRIL, 12);
        System.out.println(localDate);
        System.out.println(System.identityHashCode(localDate));
        // localDate.plusDays(10); // Won't work / change as it needs to be reassigned
        // to the variable.
        localDate = localDate.plusDays(10); // Will result in reassigning to a new memory location.
        System.out.println(localDate);
        System.out.println(System.identityHashCode(localDate));

        System.out.println("");

        // LocalTime
        LocalTime localTime = LocalTime.of(12, 30);
        System.out.println("localTime=" + localTime);
        System.out.println(System.identityHashCode(localTime));
        localTime = localTime.plusMinutes(20);
        System.out.println("localTime=" + localTime);
        System.out.println(System.identityHashCode(localTime));

        System.out.println("");

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime=" + localDateTime);
        System.out.println(System.identityHashCode(localDateTime));
        localDateTime = localDateTime.plusDays(2).minusHours(2).minusWeeks(1);
        System.out.println("localDateTime=" + localDateTime);
        System.out.println(System.identityHashCode(localDateTime));

        System.out.println("");

        /*
         * Before Java 8
         */
        Date myDate = new Date(); // returns current date
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.setTime(myDate);
        myDate = myCalendar.getTime();
        System.out.println("myDate=" + myDate);

        // Manipulating the current year, month and date
        myCalendar.set(Calendar.DATE, 22);
        myCalendar.set(Calendar.MONTH, 11); // Will be December since month starts from 0
        myCalendar.set(Calendar.YEAR, 2022);

        myDate = myCalendar.getTime();
        System.out.println("myDate=" + myDate);

        System.out.println("");

        /*
         * Exam tricks
         */

        // Whats is the output of the following code? It will be the same since ld is
        // immutable and need to reassigned in order to reflect the changes.
        LocalDate ld = LocalDate.of(2015, 04, 13);
        ld.of(2022, Month.AUGUST, 8);
        System.out.println(ld);

        // Calling invalid methods.
        // ld.plusMinutes(10);// LocalDate doesn't have plusMinutes but LocalTime is.
        LocalTime lt = LocalTime.of(12, 15);
        // lt.addDays(10); Won't compile since addDays isn't a valid method on LocalTime
    }
}
