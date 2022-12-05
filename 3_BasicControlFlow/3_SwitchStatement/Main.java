import java.util.Random;

class Main {

    /*
     * Data types supported by switch statements: primitives int, short, byte and
     * char (including wrappers)
     */

    public static void main(String[] args) {

        int dayOfWeek = 0;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        /*
         * Breaks in switch.
         * The "break" statements are optional. Hence it'll execute until it gets to the
         * first break (Credit and Distinction).
         * Using char example
         */

        char grade = 'C';

        switch (grade) {
            case 'C':
                System.out.println("Credit");
            case 'D':
                System.out.println("Distinction");
                break;
            case 'S':
                System.out.println("Simple");
                break;
            default:
                System.out.println("Fail");
                break;
        }

        /*
         * Bundling case statements (similar to using OR ||)
         */

        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; // returns char and adding offset to produce lower case letters
        System.out.println(c + " -> " + (char) c); // need to cast to char or it'll print the corresponding ASCII int

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("Sometimes a vowel");
                break;
            default:
                System.out.println("consonant");
        }

        /*
         * Special cases and examples that won't work
         */
        int x = 4;
        switch (x) {
            case 4:
                // case x: // won't compile
                // case "X": // won't compile (expects an int not String)
            case 'K': // will work since we can cast char to int (char underneath represents an int
                      // ASCII)
        }

    }
}