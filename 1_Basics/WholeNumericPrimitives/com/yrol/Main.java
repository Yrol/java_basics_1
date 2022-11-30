class Main {

    public static void main(String[] args) {

        /*
         * Need to add "L" at the end to mark it as a long. By default all whole numbers
         * are treated as integers (although the variable type is long).
         * 32123456789 - will throw an error without "L" since its too big for an
         * integer to hold this value.
         */
        long max = 32123456789L;

        /*
         * Can also user underscores ("_") to format a long number for ease of reading.
         * Underscores cannot be used at the beginning.
         */
        long max_u = 321_234_567_89L;

        /*
         * Using the base to represent number - Octal, Hexadecimal and binary.
         */

        /*
         * ############## Octal numbers (0 - 7) ################
         */
        int oct1 = 010; // 8 decimal
        int oct2 = 022; // 18 decimal
        int oct3 = 07;

        // Invalid octal since not within (0 - 7)
        // int oct3 = 08;

        /*
         * Addition of octal:
         * Addition of octal will automatically result in decimal.
         * To convert octal addition to decimal we need to use the function -
         * Integer.toOctalString(octalSum)
         */
        int sumOct = oct1 + oct2;
        System.out.println("First oct=" + oct1 + " second oct=" + oct2);
        System.out.println("Decimal sum=" + sumOct);
        System.out.println("Octal sum=" + Integer.toOctalString(sumOct));

        /*
         * ######### Hexadecimal numbers (numbers 0 -8 and letters A - F) ############
         */
        int hex1 = 0xF; // 15 decimal
        int hex2 = 0x1E; // 30 decimal
        int hexSum = hex1 + hex2;
        System.out.println("First Hex:" + hex1 + " Second hex:" + hex2);
        System.out.println("Decimal sum=" + hexSum + " Hex sum=" + Integer.toHexString(hexSum));

        /*
         * ########## Binary numbers (number 0 - 1) ############
         * In the exam we need to identify only valid literals.
         */
        int bin1 = 0b1001; // 9 decimal
        int bin2 = 0b0111; // 7 decimal
        int sumBin = bin1 + bin2;

        System.out.println("First bin=" + bin1 + " Second bin=" + bin2);
        System.out.println("Decimal sum=" + sumBin + " Bin sum=" + Integer.toBinaryString(sumBin));
    }
}