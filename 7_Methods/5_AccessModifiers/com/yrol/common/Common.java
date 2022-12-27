package com.yrol.common;

public class Common {

    public int publicNumber = 10;
    protected int protectedNumber = 20;
    int defaultNumber = 50;
    private int privateNumber = 60;

    public void publicPrint() {
        System.out.println("Print");
    }

    protected void protectedPrint() {
        System.out.println("Protected Print");
    }

    void defaultPrint() {
        System.out.println("Defualt Print");
    }

    private void privatePrint() {
        System.out.println("Private Print");
    }

    public static void main(String[] args) {

        // Can access all 4 methods / access modifiers since we're in the same class
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();

        // Can access all 4 variables / access modifiers since we're in the same class
        System.out.println("Public number=" + common.publicNumber);
        System.out.println("Private number=" + common.privateNumber);
        System.out.println("Protected number=" + common.protectedNumber);
        System.out.println("Default number=" + common.defaultNumber);
    }
}
