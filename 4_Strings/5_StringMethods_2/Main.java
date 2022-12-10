public class Main {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2)); // false

        System.out.println("equalsIgnoreCase");
        /*
         * equalsIgnoreCase
         */
        System.out.println(str.equalsIgnoreCase(str2));// true
        System.out.println("ABC".equalsIgnoreCase("abc")); // true

        /*
         * startsWith - from the beginning (default) or from a given point.
         * endsWith
         * Check whether a string starts or ends with a certain character.
         */
        System.out.println("");
        System.out.println("startsWith");

        // startsWith
        System.out.println(str.startsWith("j")); // true
        System.out.println(str.startsWith(str3)); // "ja" true
        System.out.println(str.startsWith("J")); // false
        System.out.println(str.startsWith("J".toLowerCase())); // valid and true

        // toffset (inclusive) - where to begin looking in the string
        System.out.println(str.startsWith("va", 1)); // false
        System.out.println(str.startsWith("va", 2)); // true

        System.out.println("");
        System.out.println("endsWith");

        // endsWith
        System.out.println(str.endsWith("a")); // true
        System.out.println(str.endsWith("va")); // true

        System.out.println("");
        System.out.println("contains");

        /*
         * Contains
         */
        System.out.println(str2.contains("av")); // true
        System.out.println(str2.contains(str)); // false
        System.out.println(str.contains(str2.toLowerCase())); // true

        System.out.println("");
        System.out.println("Replace");
        /*
         * Replace - substitute certain chars of strings
         * 
         */
        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace('a', 'A')); // using char. Notice single quotes
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString); // the original string remains the same since strings are immutable and not
                                      // reassignment has been done.

        /*
         * Trim - removes whitespace from beginning and end of string
         */
        String myString2 = " Java is    cool ";
        System.out.println(myString2); // will print with beginning and end space
        System.out.println(myString2.trim()); // will remove space from beginning and end
    }
}
