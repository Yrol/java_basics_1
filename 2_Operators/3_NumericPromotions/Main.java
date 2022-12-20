class Main {

    /*
     * ##### Auto promote (converting smaller data type to a bigger data type)
     * ######
     * 
     * Rule 1:
     * When two values are different types, Java will auto promote one of the values
     * to the larger type. Ex: When we add (+) float and double, Java will auto
     * promote to double.
     * 
     * Rule 2:
     * When one of the values is integral (byte, short, int, long) and the other is
     * floating-point, Java will auto promote value to floating point (float,
     * double).
     * 
     * Rule 3:
     * Small data types (byte, short and char) will be first promoted to int when
     * used with binary arithmetic operators (+, -, *, /, %) when neither operands
     * is int.
     * 
     * Rule 4:
     * After the promotion has finished and operands are the same data type (e.g all
     * double). The result will have the same data type as its promoted.
     * 
     * 
     * ####### Casting ##########
     * Casting is converting bigger type to smaller type (opposite of auto promote).
     * When there is an overflow, Java will automatically wrap the value to be the
     * lowest of the casting type.
     */

    public static void main(String[] main) {

        // Promotion is converting "smaller" to "bigger" type.

        // When types are different, convert smaller to bigger type (Rule 1)
        double j = 14.5;
        float k = 5.7f;
        System.out.println("j + k= " + (j + k)); // result is type double

        // Integral to floating (Rule 2) - result will have double
        int x = 5;
        double y = 10.55;
        System.out.println("x + y= " + (x + y)); // 15.55 - auto promote to double
        // int result = x + y; // won't compile as auto promote result is double(64bit)
        // and cannot be converted to a smaller int(32bit)

        // Rule 1
        byte b = 10;
        int c = 5;
        double d = 4.5;
        // Auto promoted to double
        double result = b + c + d;
        System.out.println("result= " + result); // result is type double

        // Rule 3 - promoted to int first before the addition. The result will be it
        short myShort1 = 3;
        short myShort2 = 14;
        System.out.println("myShort1 + myShort2= " + (myShort1 + myShort2));

        // All the rules will be applied and result will be double (then Apply Rule 2 at
        // the end)
        short q = 14;
        float r = 13f;
        double s = 30;
        System.out.println("q * r / s = " + (q * r / s));

        /*
         * Casting is converting bigger type to smaller type (opposite of auto promote)
         */

        // Ex1
        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;
        System.out.println("result= " + myInt);

        // Ex2: this will result in overflow since byte can only hold -127 to 128,
        // hence the byteResult will be -116
        int anotherInt = 125;
        byte myByte = 15;
        byte byteResult = (byte) (anotherInt + myByte);
        System.out.println("byteResult= " + byteResult);

        int intResult = anotherInt + myByte;
        System.out.println("intResult= " + intResult);

        short myShort3 = 10;
        short myShort4 = 20;

        // Ex3
        // short shortResult = myShort3 * myShort4 // wont compile since int. Hence cast
        // to short as below.
        short shortResult = (short) (myShort3 * myShort4);
        System.out.println("shortResult=" + shortResult);
    }
}