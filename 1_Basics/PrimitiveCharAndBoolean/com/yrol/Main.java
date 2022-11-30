class Main {

    public static void main(String[] main) {

        /*
         * ############## Char ################
         * size 16 bits
         * Single character only between quotes
         */

        char ch1 = 'a';
        // char ch2 = 'ab'; // not allowed since exceeding the size

        char ch2 = '1'; // represents a character not a number

        char uniChar1 = '\u03A9'; // unicode represent uppercase greek omega - Ω

        char uniChar2 = '\u216C'; // unicode represents 50 number (in character NOT number)

        // Will print from ASCII table
        System.out.println("ch1=" + ch1);
        System.out.println("uniChar1=" + uniChar1);
        System.out.println("uniChar2=" + uniChar2); // will print the Roman number L which is 50

        /*
         * ############## Boolean ################
         * size: N/A only 1 or 0
         */

        boolean boolean1 = false;
        boolean boolean2 = true;

        // boolean true = false // won't work since true is a reserved keyword.

        System.out.print("boolean1:" + boolean1);
        System.out.print("boolean2:" + boolean2);

    }
}