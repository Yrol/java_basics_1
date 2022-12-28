package com.yrol;

/*
 * Static methods and variables can be accessed without using an instance variable
 */

public class Main {

    static final int myStaticInt = 10;

    public static void main(String[] args) {

        // Accessing the static int
        System.out.println("myStaticInt=" + myStaticInt);

        // Accessing the main method (static) of the AnotherMain class without
        AnotherMain.main(args);
    }
}
