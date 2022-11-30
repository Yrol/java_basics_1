// import java.sql.Date; // invalid since imports should be defined after package declaration below.

package com.yrol;

import java.util.*;

// declaring another class - Valid scenario
class anotherClass {
}

// public class basClass {} //won'r compile as cannot have two public classes

public class Main {

    public static void main(String[] args) {
        // void method() {} // won't compile since cannot declare method inside another.

        // Easy way to remember the ordering (PIC) - Package, Import and Class
    }
}