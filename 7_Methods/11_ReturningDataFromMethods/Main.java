public class Main {

    /*
     * Returning data from a method will return a copy of the data to the caller.
     */
    public static void main(String[] args) {

        int number = 2;
        String word = "xyz";

        number(number);
        System.out.println("number=" + number);// 2

        // Reassign the word to the returned value
        word = word(word);
        System.out.println("word=" + word); // xyza

        number = number(number);
        System.out.println("number=" + number); // 3

    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String word(String word) {
        word += "a";
        return word;
    }
}
