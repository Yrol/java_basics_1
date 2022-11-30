class Main {

    public static void main(String[] args) {

        /*
         * ######## Floats ###########
         * Size 32 bits
         */

        // Should use letter "f" explicitly after to mark it as a float number (by
        // default decimal numbers are always double)

        float myFloat1 = 34.5f;

        // float myFloat2 = 78.67; // doesn't compile since by default its a double and
        // cannot assign double to floats.

        /*
         * ######## Doubles ###########
         * Size 64 bits
         */

        double myDouble1 = 50.57;

        double myDouble2 = 50.57f; // f means nothing here and will automatically get converted to a double

        // Using underscores

        // double first = _10.5; // doesn't compile
        // double after = 10._34 // doesn't compile
        // double before = 10_.95; // doesn't compile
        // double last = 10.89_ // doesn't compile

        double myDouble3 = 1_0.87; // 10.87

        // scientific doubles
        double scientific1 = 5.000123E03; // represents the double: 5000.123. Shifting 3 decimal point to left Using E03
        double scientific2 = 5.000123E3; // represents the same scientific1 with (E3 instead of E03)
        // double scientific3 = 5.000123F3; // will not compile and need to have letter
        // "E" always
        double myDouble4 = 5000.123;

        System.out.println("Scientific1=" + scientific1);
        System.out.println("Scientific1=" + scientific2);
        System.out.println("myDouble4=" + myDouble4);

        // Doubles with Hexadecimal representation.
        double hexPi = 0x1.91eb851eb851fp1; // "p" represents hexadecimal floating point.

        System.out.println("hexpi=" + hexPi);

    }
}