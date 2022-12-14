public class Main {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        // Will throw index out of bound exception on runtime. (numbers.length - 1) will
        // fix the issue
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Getting the length of the array
        // int size = numbers.length(); // doesn't compile as length is not a method but
        // a final variable
        int size = numbers.length; // valid

        // Attempting to change the array size. Can only define size at initialization.
        // numbers.length = 10; //doesn't compile as length is a final variable and
        // cannot be changed.
    }
}
