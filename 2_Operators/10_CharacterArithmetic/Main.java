public class Main {

    /*
     * char can be represented using integer between 0 - 65535 and can be used with
     * integer arithmetic (these can then be mapped to letters using the ASCII).
     * char is a single character or number and it is used with single quotes
     * Can user Character class wrapper to perform operations
     */

    public static void main(String[] args) {

        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA=" + myCharA);

        // Using Character class wrapper
        System.out.println("myCharA is letter? " + Character.isLetter(myCharA));
        System.out.println("myCharA is digit? " + Character.isDigit(myCharA));

        System.out.println("myCharNum=" + myCharNum);

        // Using Character class wrapper
        System.out.println("myCharNum is letter? " + Character.isLetter(myCharNum));
        System.out.println("myCharNum is digit? " + Character.isDigit(myCharNum));

        // exam example 1
        char letter = 65; // 65 is character "A" in ASCII table
        int myInt = letter + 3; // A = 65, B = 66, C = 67, D = 68. Hence myInt == D
        char myNewLetter = (char) myInt; // casting integers into characters.

        System.out.println("letter=" + letter);
        System.out.println("myInt=" + myInt);
        System.out.println("myNewLetter=" + myNewLetter);

        // exam example 2
        char myChar = 65; // A
        // char newChar = myChar + 1; won't compile since chars are converted to int
        char newChar = (char) (myChar + 1); // 66 == B
        boolean b = newChar == 'B';
        boolean c = (newChar++ < 'C'); // can do this since converted to int automatically. Here we're doing post ++.
                                       // Hence by the time of the comparison newChar is B and then it becomes C.
                                       // Therefor the statement is true.
        System.out.println("myChar=" + myChar);
        System.out.println("newChar=" + newChar);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}
