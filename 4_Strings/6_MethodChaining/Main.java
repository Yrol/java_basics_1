public class Main {

    /*
     * Method chaining - calling multiple methods one after another
     */
    public static void main(String[] args) {
        /*
         * Without chaining
         */
        String start = " Java  ";
        String trimmed = start.trim();
        System.out.println("trimmed=" + trimmed);

        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowerCase=" + lowerCase);

        String result = lowerCase.replace('j', 'J');
        System.out.println("result=" + result);

        /*
         * With chaining
         * The following can only be done when each method returns a String object.
         */

        // Ex:1
        String anotherResult = "  Java ".trim().toLowerCase().replace('j', 'J');
        System.out.println(result.equals(anotherResult));

        // Ex:2
        String a = "abc";
        String b = a.toUpperCase();
        String c = b.replace('B', 'b').replace('C', 'c');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        // exam type of questions

        // 1. Will the following print? Yes
        if (a.equalsIgnoreCase(b)) {
            System.out.println("a and b variable strings matches 1");
        }

        // 2. Will the following print? Yes
        if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
            // a == "abc"
            // a.toLowerCase().trim() == "abc"
            // b == "ABC"
            // b.toLowerCase().trim() = "abc"
            System.out.println("a and b variable strings matches 2");
        }

    }
}
