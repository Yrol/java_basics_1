/*
 * Using Periods we can specify the set duration such as:
 * - Adding weeks to a date
 * - Adding month to a date
 * 
 * Important: its not possible to chain methods (static) in Periods. If we chain, only the last method will return a value. 
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.APRIL, 22);
        LocalDate end = LocalDate.of(2022, Month.AUGUST, 8);

        // Method without Period implementation
        // cleanAnimalCage(start, end);

        // Method with Period implementation (calling the cleanAnimalCage every 2 weeks)
        cleanAnimalCage(start, end, Period.ofWeeks(2));

        /*
         * Using the periods class
         */
        Period period = Period.ofWeeks(1);
        System.out.println("Start=" + start.plus(period));
        System.out.println("LocalDateTime=" + LocalDateTime.now().plus(period));
        // System.out.println("LocalTime=" + LocalTime.now().plus(period)); // Will
        // throw an exception as LocalTime doesn't support adding days or months.

        // Chaining ex: - Only the last method "ofMonths" will return a value.
        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
        System.out.println("yearAndMonth=" + yearAndMonth); // P1M

        // The above can be achieved using "of" method by adding 1 year and 1 month.
        yearAndMonth = Period.of(1, 1, 0);
        System.out.println("yearAndMonth=" + yearAndMonth); // P1Y1M
    }

    /*
     * Without period. The following isn't efficient since it supports only increase
     * by 1 month. Which isn't reusable.
     */
    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date=" + start);
            start = start.plusMonths(1);
        }
    }

    /*
     * Using periods
     * - Fixing the above cleanAnimalCage to reuse.
     */
    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date=" + start);
            start = start.plus(period);
        }
    }
}
