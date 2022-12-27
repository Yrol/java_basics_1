package com.yrol.common;

public class AnotherCommon {
    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        // common.privatePrint(); // Won't work as its private within Common.java

        System.out.println("Public number=" + common.publicNumber);
        // System.out.println("Private number=" + common.privateNumber); // only within
        // Common.java
        System.out.println("Protected number=" + common.protectedNumber);
        System.out.println("Default number=" + common.defaultNumber);
    }
}
