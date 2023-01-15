/*
 * - Date and time can be formatted using .format() function on on LocalDate, LocalTime and LocalDateTime and then passing the DateTimeFormatter static functions.
 * - Using the format functionality we can extract date and time separately from the LocalDateTime.
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*
         * Using the formatter
         */
        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(12, 15, 20);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); // Displaying date only - 2010-04-15
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)); // Displaying time only - 12:15:20
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // Displaying both Date and time -
                                                                                    // 2010-04-15T12:15:20

        /*
         * Using the short and medium formatter
         */

        // Example of formatting the date
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortFormatter.format(dateTime)); // 4/15/10
        System.out.println(mediumFormatter.format(date)); // Apr 15, 2010
        // System.out.println(shortFormatter.format(time)); // INVALID (runtime
        // exception) as time can't be formatted using date formatting.

        // The above 2 outputs can also be written as below
        System.out.println(dateTime.format(shortFormatter));
        System.out.println(dateTime.format(mediumFormatter));

        /*
         * Custom formatter
         */
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM  dd, yyyy, hh:mm");
        System.out.println(customFormatter.format(dateTime));

        // Can also be written
        System.out.println(dateTime.format(customFormatter));

        /*
         * Formatting before Java 8
         */
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

        /*
         * Exam related:
         * - Tricky questions will try to format incompatible type such as apply time
         * format on a date.
         */
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dateTime.format(df)); // 12:15 - will work since it contain both time and date.
        System.out.println(time.plusHours(5).format(df)); // 05:15 - Will work since it contains time.
        // System.out.println(date.format(df));// INVALID: will throw an exception since
        // contains only date.
    }
}
