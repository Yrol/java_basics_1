/*
 * Parsing is a way to converting String to Object representation.
 * Converting String to Date using .format() method.
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date); // This will print 2010-02-15 which is the default format since its in LocalDate
                                  // type. to print it in "MM dd yyyy" convert to a String as below
        String text = date.format(formatter);
        System.out.println(text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);

        /*
         * Exam trick
         */
        LocalDate myDate = LocalDate.of(2010, Month.APRIL, 20);
        String dateString = formatter.format(myDate);
        System.out.println("dateString=" + dateString);

        // Converting back to local date
        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(5); // won't work since need to reassign (immutable)
        anotherDate = anotherDate.plusMonths(5).plusDays(5);
        System.out.println("anotherDate=" + formatter.format(anotherDate));
    }
}
