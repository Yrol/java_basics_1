class Main {

    // Global variable
    static int myInt1 = 5;

    public static void main(String[] args) {

        int myLocalInt = 10;

        /*
         * Using code block
         * Variables inside code blocks only available within the block and not outside
         */
        {
            int myLocalInt2 = 20;
            System.out.println("myLocalInt2=" + myLocalInt2);

            System.out.println("myLocalInt=" + myLocalInt);

            System.out.println("myInt1=" + myInt1);

            // child block - can access the variables defined in the parent block
            {
                // int myLocalInt2 = 50; // worn't work since already defined in the parent
                // block (duplicate error)
                myLocalInt2 = 40;
            }

            System.out.println("myLocalInt2=" + myLocalInt2);
        }

        // System.out.println("myLocalInt2=" + myLocalInt2); // won't work since outside
        // of scope

        System.out.println("myLocalInt=" + myLocalInt);

        // Note: this is not the same variable myLocalInt2 define the code block above.
        // It has a different scope.
        int myLocalInt2 = 30;
        System.out.println("myLocalInt2=" + myLocalInt2);

    }
}