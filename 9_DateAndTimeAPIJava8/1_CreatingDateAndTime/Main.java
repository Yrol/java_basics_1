import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/*
 * - In Java 8, there are 3 main classes that can be used for Date and Time available in the "java.time" package:
 *  - LocalTime -  using only when time related functionality is needed.
 *  - LocalDate - using only when date related functionality is needed. 
 *  - LocalDateTime - using when both time and date related functionality is needed.
 * 
 * The above classes are coming from the "java.time" package.
 * The overloaded methods in each of the above can be used.
 * All these classes are immutable (just like String) - meaning we cannot change them once assigned and need to reassign to get a new value / change them. 
 */

public class Main {
    public static void main(String[] args) {

        /*
         * Working with Date and Time methods.
         * Using the overloaded "of" methods for different functionality.
         */

        System.out.println(LocalDate.now()); // will print the current time
        System.out.println(LocalTime.now()); // will print the current date in year, month & date format
        System.out.println(LocalDateTime.now()); // will print the current date and time

        // creating a date using int values (provide year, month & date)
        LocalDate localDate = LocalDate.of(2020, 9, 7);
        System.out.println("localDate=" + localDate);

        // Using the "Month" ENUM to provide the month
        LocalDate localDate2 = LocalDate.of(2021, Month.FEBRUARY, 28);
        System.out.println("localDate2=" + localDate2);

        // Invalid scenarios
        // LocalDate localDate2 = LocalDate.of(0, null, 0); // exception - month cannot
        // be null
        // LocalDate localDate2 = LocalDate.of(0, Month.APRIL, 0); // exception - day of
        // the month must be a valid value
        // LocalDate localDate2 = LocalDate.of(2021, Month.FEBRUARY, 29); // exception -
        // Invalid leap year

        // combining local date and time using LocalDateTime
        LocalTime localTime = LocalTime.of(19, 20); // using 24hours time
        LocalDateTime localDateTime = LocalDateTime.of(localDate2, localTime);
        System.out.println("localDateTime=" + localDateTime);

        /*
         * Older class available before Java 8 (achieving the above before Java 8).
         * These classes are available in the "java.util" package.
         */

        // Using Date() from the "java.util" package
        System.out.println(new Date());

        // Setting a specific date and time (need to use Calendar)
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 31);
        Date date = calendar.getTime(); // will return the above date with the current time
        System.out.println("date=" + date);
    }
}
