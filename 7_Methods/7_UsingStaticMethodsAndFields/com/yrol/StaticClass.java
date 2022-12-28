package com.yrol;

public class StaticClass {

    private String name = "James";

    public static void one() {
    }

    public static void two() {
    }

    public static void three() {
        // calling the above static methods within static method
        one();
        two();

        // calling non-static method within static isn't allowed
        // four(); // compile error

        // calling non-static variable within static isn't allowed
        // System.out.println(name);
    }

    // None static method
    public void four() {

        // calling the static methods
        one();
        two();
        three();

        // calling static variable
        System.out.println(name);
    }

    public static void main(String[] args) {

        // Calling static methods above
        StaticClass.one(); // method 1
        one(); // method 2

        // Attempting to call non-static within static main method
        // four(); compile error

        // The above non static can be called in following ways

        // Method 1:
        StaticClass staticClass = new StaticClass();
        staticClass.four();

        // Method 2:
        new StaticClass().four();
    }

}
