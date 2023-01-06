/*
 * - Interface can contain constants and by default they're public, static and final. They cannot be change once declared in the interface.
 * - Interfaces can have methods by default they are public and abstract (automatically) and CANNOT be protected or private.
 * - Methods inside interfaces cannot have body (same as in abstract classes).
 */

package com.yrol;

public interface HasTail {

    // Defining variable and no need to declare "public static final".
    int DEFAULT_TAIL_LENGTH = 2;

    // Defining a method. No need to specify public abstract as it automatically
    // applies.
    int getTailLength();

    // protected int getTailLength(); // INVALID as cannot be protected or private.

    // Invalid as methods cannot contain body
    // int getTailLength(){}

}
