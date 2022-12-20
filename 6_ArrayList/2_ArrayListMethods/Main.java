import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Important methods:
     * - add, remove and set
     * - empty, size, clear and contains
     * - equals - in ArrayList equals operation is a custom implementation where it
     * checks the elements of two list to be exactly the same including index
     * position.
     */
    public static void main(String args[]) {

        /*
         * Add
         */

        // Creating a generic list
        List list = new ArrayList<>();

        // Adding values
        list.add("Dog");
        list.add(5);

        // Printing the list (will call the toString() method automatically)
        // list.toString() is not necessary
        System.out.println(list);// [Dog, 5]

        // Creating a type String list and add elements
        List<String> pets = new ArrayList();
        pets.add("Cat");
        // pets.add(4); // Invalid. Only Strings are allowed

        // adding to a specific index (at 0)
        pets.add(0, "Dog");
        System.out.println(pets);// ["Dog", "Cat"]

        pets.add(1, "Parrot");
        System.out.println(pets);// ["Dog", "Parrot", "Cat"]

        /*
         * Remove
         * - Can remove by value (first occurrence) or by index
         * - Will return a boolean
         */
        List<String> companies = new ArrayList();
        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Toyota");
        companies.add("Google");
        System.out.println(companies); // [Google, Microsoft, Toyota, Google]
        companies.remove("Google"); // remove first occurrence of Google
        System.out.println(companies); // [Microsoft, Toyota, Google]
        companies.remove(0);
        System.out.println(companies); // [Toyota, Google]

        // companies.remove(100); // will cause out of bound exception.

        System.out.println("Tesla remove by value:" + companies.remove("Tesla")); // false

        /*
         * Set
         * - Setting value at a specific index (will replace the existing value)
         */
        companies.set(0, "Microsoft");
        System.out.println(companies); // [Microsoft, Google]

        // tricky scenarios

        // Attempting to set a value on an invalid index
        // companies.set(6, "Google"); // will throw out of bound exception

        /*
         * Size and Empty
         */

        // isEmpty() (return boolean)
        List<String> brands = new ArrayList();
        System.out.println(brands.isEmpty()); // true (boolean)

        // size() - return size of the list (in int)
        System.out.println(brands.size());

        // Another way to check if the list is empty
        if (brands.size() == 0) {
            System.out.println("No brands found");
        }

        brands.add("Pepsi");
        System.out.println(brands.isEmpty()); // false
        System.out.println(brands.size()); // size

        /*
         * Clear - remove all the list of the list
         */

        brands.clear(); // will remove all elements
        System.out.println(brands.isEmpty()); // true
        System.out.println(brands.size());// 0

        /*
         * Contains - returns a boolean
         */
        brands.add("McDonalds");
        System.out.println(brands.contains("McDonalds")); // true
        System.out.println(brands.contains("Coca-Cola")); // false

        /*
         * Equals
         */
        brands.add("KFC");
        List<String> newBrands = new ArrayList();
        newBrands.add("McDonalds");
        newBrands.add("KFC");

        System.out.println(newBrands.equals(brands)); // true

        newBrands.add("IBM");
        System.out.println(newBrands.equals(brands));// false

        // same elements on different indexes
        brands.add(0, "IBM");
        System.out.println(brands);
        System.out.println(newBrands);
        System.out.println(newBrands.equals(brands)); // false
    }
}
