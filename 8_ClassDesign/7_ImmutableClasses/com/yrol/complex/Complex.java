package com.yrol.complex;

/*
 * Immutable classes are unchangeable means there are only getters but not setters.
 * Immutable classes can also contain static methods.
 */

public class Complex {

    private final double real;
    private final double imaginary;

    // Constructor will be used to set the values
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    /*
     * Non-static examples
     */

    // Plus operation
    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Minus operation
    public Complex minus(Complex otherComplex) {
        double newReal = real + otherComplex.real;
        double newImaginary = real + otherComplex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    /*
     * Static examples
     */

    // Plus operation
    public static Complex plus(Complex b, Complex a) {
        // Method 1: Accessing the variables directly (a.real, b.real) since we're in
        // the same class
        // double real = a.real + b.real;
        // double imaginary = a.imaginary + b.imaginary;
        // return new Complex(real, imaginary);

        // Method 2:
        return a.plus(b);
    }
}
