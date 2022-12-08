public class Main {

    /*
     * Comparing strings
     * Rules
     * - The "==" will compare the object reference.
     * - The "equals()" method will compare the actual value attached to the object
     */
    public static void main(String[] args) {

        // Since value is "John" and not using "new" keyword java will check the
        // existing String Pool and refer to the same memory location
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";

        // when "new" is used it creates new object in the Java Heap and will not
        // reference the existing String pool
        String newName = new String("John");

        // comparing object references
        System.out.println("name == anotherName -> " + (name == anotherName)); // true
        System.out.println("name == john -> " + (name == john)); // true
        System.out.println("name == newName -> " + (name == newName)); // false

        // comparing object internal value
        System.out.println("name.equals(newName) ->" + name.equals(newName));// true
        System.out.println("name.equals(anotherName) ->" + name.equals(anotherName)); // true
        System.out.println("name.equals(john) ->" + name.equals(john)); // true

        // checking the object reference
        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));

        // Exam type questions
        String str1 = "abc";
        String str2 = "ab";

        // The following will return different memory locations although we do ("ab" +
        // "c") underneath in both occasions.
        String str3 = str2 + "c"; // concat runtime since str2 is a variable. Causing str3 to be new variable
        String str4 = "ab" + "c"; // concat at compile time and return a location from String Pool if applicable.

        System.out.println("str1 == str2 -> " + (str1 == str2)); // false
        System.out.println("str1 == str3 -> " + (str1 == str3)); // false
        System.out.println("str1 == str4 -> " + (str1 == str4)); // true

        // memory locations will be different
        System.out.println("str3 - identityHashCode -> " + System.identityHashCode(str3));
        System.out.println("str4 - identityHashCode -> " + System.identityHashCode(str4));
    }
}
