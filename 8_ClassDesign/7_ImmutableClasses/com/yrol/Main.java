package com.yrol;

import com.yrol.complex.Complex;

/*
 * Immutable classes are unchangeable means there are only getters but not setters.
 * All the Java wrapper classes ex: String, Double and Float are immutable classes.
 */
public class Main {

    public static void main(String[] args) {

        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        Complex bPlusA = b.plus(a);

        System.out.println("Imaginary=" + bPlusA.getImaginary());
        System.out.println("Real=" + bPlusA.getReal());
    }
}
