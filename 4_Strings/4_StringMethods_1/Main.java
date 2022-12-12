public class Main {

    /*
     * When applying methods below remember:
     * - Strings are sequence of characters (start from index 0)
     * - Strings a immutable (cannot change)
     */
    public static void main(String[] args) {
        // indexes
        // 0: J
        // 1: a
        // 2: v
        // 3: a
        // 4:
        // 5: i
        // 6: s
        // 7:
        // 8: f
        // 9: u
        // 10: n
        String str = "Java is fun";

        System.out.println("length=" + str.length());

        /*
         * char at (finding the character in a certain index)
         */
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));
        // System.out.println(str.charAt(12)); // will cause an out of bound exception

        /*
         * Index of
         */
        System.out.println(str.indexOf("a")); // will return the first "a"
        System.out.println(str.indexOf("a", 2)); // will return the first "a" after index 2
        System.out.println(str.indexOf("fun")); // will return the index of word fun (starting point)
        System.out.println(str.indexOf("fun", 10)); // will return -1 which is not found

        /*
         * substring
         */
        str.substring(8); // won't do anything since string are immutable
        System.out.println(str);

        // beginIndex − the begin index, inclusive.
        // endIndex − the end index, exclusive. <-- IMPORTANT!
        System.out.println(str.substring(8)); // "fun": Will print from 8th index onwards
        System.out.println(str.substring(0, 3)); // will print "Jav".Index 3 is exclusive
        System.out.println(str.substring(4, 4)); // (both indexes are equal) nothing will be printed

        // causing an out of bound exception and will revert the string. End must be
        // always greater than start
        // System.out.println(str.substring(4, 1));

        // tricky scenarios
        System.out.println("AbCd".toLowerCase());// valid
        String dog = "Lucky";
        dog.toLowerCase(); // won't be applied to the "dog" var
        System.out.println(dog);

        System.out.println(dog.toLowerCase()); // will lowercase but won't be directly applied to "dog" variable
        System.out.println(dog);

        dog = dog.toLowerCase(); // will reassign with new changes (lowercase)
        System.out.println(dog);

    }
}
