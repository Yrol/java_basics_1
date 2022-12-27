package com.yrol;

import com.yrol.common.Common;

public class Main {
    public static void main(String[] args) {

        /*
         * Accessing the methods
         */
        Common common = new Common();
        common.publicPrint();

        // The following are not allowed as this class is NOT within the Common package
        // common.protectedPrint();
        // common.defaultPrint();
        // common.privatePrint(); // Won't work as its private within Common.java

        /*
         * Accessing the variables
         */
        System.out.println("Public number=" + common.publicNumber);

        // The following are not allowed since in a different package
        // System.out.println("Private number=" + common.privateNumber);
        // System.out.println("Protected number=" + common.protectedNumber);
        // System.out.println("Default number=" + common.defaultNumber);
    }
}
