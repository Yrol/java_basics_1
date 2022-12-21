import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        /*
         * - There are multiple ways to iterate through a list - Iterator and
         * ListIterator.
         * - We can't modify the List that we're iterating through using for or foreach
         * loops.
         * In order to iterate and modify, we must use the Iterator or ListIterator from
         * java.util
         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

            // trying to remove while iterating - this is tricky will not remove the items
            numbers.remove(i);
        }

        for (Integer number : numbers) {
            System.out.println("number=" + number);

            // trying to remove while looping
            // numbers.remove(2); // will get a runtime exception:
            // ConcurrentModificationException
        }

        /*
         * Iterator - iterate through List and remove one by one
         * Iterator has 3 important methods
         * - iterator
         * - hasNext (returns boolean)
         * - remove
         */
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) { // Note: no incrementor has been
                                                                                     // used
            Integer number = iterator.next(); // next element. NOT the current.
            System.out.println(number);
            iterator.remove(); // remove the current item
        }

        System.out.println(numbers); // []

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        /*
         * ListIterator
         * - Can only be used with Lists
         * - Unlike Iterator above this allows to add and modify the List
         * - Can iterate backwards
         */

        // Ex1: Looping backwards start from index 3 (exclusive) which is value 4. Will
        // print 3, 2, 1
        for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();) {
            // System.out.println(listIterator.next()); // Will throw NoSuchElementException
            // since iterating backwards
            System.out.println(listIterator.previous());
            listIterator.remove();
        }

        System.out.println(numbers); // 4, 5, 6

    }
}
