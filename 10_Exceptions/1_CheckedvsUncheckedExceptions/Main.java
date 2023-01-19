/*
 * Checked vs Unchecked exceptions
 * - Checked exceptions include all the exceptions that do NOT extend (subclass of) RuntimeExceptions.
 * - Checked exceptions are usually anticipated. Ex: trying to open a file and the file doesn't exist.
 * - Unchecked exceptions are the ones that extend (subclass of) RuntimeExceptions.
 * - Handling of checked vs unchecked:
 *  * Checked exceptions need to handled or declare (declare in method body).
 *  * Unchecked exceptions doesn't need to handled or declared.
 */
public class Main {
    public static void main(String[] args) {

        // myMethod(); compiler error as the exception is not handled in a try catch
        // block

        try {
            myMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        anotherMethod(); // Valid to call since its an unchecked exception
    }

    // The following will compile and nothing is handling the exception (not a good
    // practice)
    // public static void main(String[] args) throws Exception {
    // myMethod();
    // }

    /*
     * Throwing a CHECKED exception
     * - The "throws" keyword simply declare there is possibility of throwing an
     * exception of type Exception.
     * - The "throw" keyword will be used to throw the actual exception.
     */
    public static void myMethod() throws Exception {
        throw new Exception("Failed to load");
    }

    // Invalid (compiler error) since unchecked exceptions need to be declared.
    // public static void myMethod2() {
    // throw new Exception("Failed to load");
    // }

    /*
     * UNCHECKED Exception
     * - No need to declare as:
     * "public static void anotherMethod() throws RuntimeException" - optional
     */
    public static void anotherMethod() {
        throw new RuntimeException("Wrong param");
    }
}
