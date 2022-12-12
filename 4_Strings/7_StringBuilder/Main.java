public class Main {

    /*
     * StringBuilder:
     * - Is not immutable (but String is)
     * - Works as a container, we can add as many strings and at the end call
     * toString method to get the final result.
     * - Unlike Strings, chaining StringBuilder methods won't produce new objects.
     */

    public static void main(String[] args) {

        /*
         * Without StringBuilder
         */
        String myString = "";

        // using char inside for loop
        // c < 'z' -> will print a - y.
        for (char c = 'a'; c <= 'z'; c++) {
            // System.out.println((int) c); // will print the corresponding ASCII value
            myString += c; // in every iteration, this will create a new String object.
        }

        System.out.println(myString);

        /*
         * With StringBuilder
         */

        // Ex: 1
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c); // uses the same StringBuilder obj without creating a new one each time.
        }

        System.out.println(sb);

        // Ex: 2
        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // start-middle

        // Both "builder" and "anotherBuilder" pointing to the same memory location
        StringBuilder anotherBuilder = builder.append("-end");

        // both will print the same output - "start-middle-end"
        System.out.println("builder=" + builder);
        System.out.println("anotherBuilder=" + anotherBuilder);

        // both will be pointing the same memory location
        System.out.println(builder == anotherBuilder); // true when comparing memory locations
        System.out.println("builder=" + System.identityHashCode(builder));
        System.out.println("anotherBuilder=" + System.identityHashCode(anotherBuilder));

        /*
         * Size and capacity of StringBuilder
         * Size: current size of the string
         * Capacity: is 16 by default and Java will increase this automatically. Can
         * also provide and lower or higher value initially to the constructor
         */

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("Size=" + myBuilder.length()); // will be 0
        System.out.println("Capacity=" + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        myBuilder.append("Hello World"); // will be greater than 0
        System.out.println("Size=" + myBuilder.length());
        System.out.println("Capacity=" + myBuilder.capacity());

        // Exam examples
        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        // both will print: "This Java is so Cool"
        System.out.println(a);
        System.out.println(b);

        // Invalid scenarios
        // StringBuilder hello = "hello"; // won't compile. Illegal assignment
    }
}
