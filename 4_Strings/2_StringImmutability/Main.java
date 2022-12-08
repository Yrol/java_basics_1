public class Main {

    /*
     * Immutable - once the object has been created, it cannot be changed.
     * In strings whenever a change is applied to a new string, it creates a new
     * string.
     */

    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + " world"; // hi = "hello world"
        hi = hello; // hi = "hello"
        System.out.println(hi + hello);

        // Won't make it uppercase since strings are immutable. Need to reassign.
        hello.toUpperCase();
        System.out.println(hello);

        // will work as reassigning (pointing to a new variable / memory location)
        hello = hello.toUpperCase();
        System.out.println(hello);

        /*
         * String concat
         */

        // Ex1:
        String s1 = "1";
        String s2 = s1.concat("2"); // s2 == "12"
        s2.concat("3"); // won't be applied since not reassigned to same or different variable
        System.out.println(s1); // 1
        System.out.println(s2); // 12

        s2 = s2.concat("3"); // s2 == "123"
        System.out.println(s2);// 123
    }
}
