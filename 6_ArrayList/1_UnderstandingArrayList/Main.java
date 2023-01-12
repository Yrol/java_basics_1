import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * - ArrayList is an implementation of the List interface (java.util.List)
     * - ArrayLists are similar to arrays and they're internally using an array.
     * - The internal array is an array of objects.
     * - ArrayList cannot store a collection of primitives like int or double.
     * - ArrayList uses generics, hence we can specify the object type on creation.
     * - Defining the Object type is optional when creating the ArrayList.
     * - By default ArrayList is type Object (if the type is not defined inside <>).
     * - Object type must be defined inside the diamond operator.
     * - Initial capacity/size of the ArrayList can be define on creation.
     */
    public static void main(String args[]) {

        // Defining an ArrayList (without an object type - this will be type Object by
        // default)
        ArrayList myList = new ArrayList<>();

        // Defining ArrayList with type Object.
        // Since every class in Java is type Object base, we can store Double, String &
        // etc in this list.
        ArrayList<Object> myList2 = new ArrayList<Object>();
        // ArrayList<Object> myList2 = new ArrayList<>(); // Valid - can also define
        // without type on right hand side

        // ArrayList accepts only Strings
        ArrayList<String> myStringList = new ArrayList<>();

        // Using the List interface directly instead of implementation ArrayList
        List<String> myList3 = new ArrayList<>();
        // ArrayList<String> myList4 = new List<>(); // Not valid

        // initial capacity/size of the ArrayList and will automatically expands.
        List<String> myList4 = new ArrayList<>(20);

        // ArrayList cannot store a collection of primitives like int or double
        // List<int> myIntList = new ArrayList<>(); // Compilation error.

    }
}