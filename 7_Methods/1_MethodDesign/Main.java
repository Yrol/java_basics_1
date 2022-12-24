public class Main {

    /*
     * Access modifiers
     * - Default - no access modifier is provided - provides Package Private access.
     * - Public - can be called within any class.
     * - Private - can be called within the same class.
     * - Protected - can be called only by classes in same package or by sub-classes
     * - Curly brackets are required.
     * 
     * Optional Specifiers
     * - Static
     * - Final
     * - Abstract
     */

    // Ex1: Using public access modifier and void return type
    public void jump() {
    }

    // Ex2: won't compile - return type must be specified after the access modifier
    // void public jump2(){}

    // Ex3: Using the default access modifier - Package private access
    void jump3() {
    }

    // Ex4: Optional specifiers - static and final
    public static final void jump4() {
    }

    // Ex5: Optional specifier order won't matter (compare with Ex4)
    public final static void jump5() {
    }

    final static public void jump6() {
    }

    static public final void jump7() {
    }

    // public static void final jump8(){} // won't compile as optional specifier
    // final is used after void

    // Ex6: with return type (String)
    public String jump9() {
        return "Jump";
    }

    // Won't compile as multiple types are not allowed to be returned.
    // public String int void jump10() {}

    public static void main(String args[]) {

    }
}
