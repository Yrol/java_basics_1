public class Main {

    /*
     * Break statements are used for stopping the loop (not the application).
     * Labels can be used which are optional
     */
    public static void main(String[] args) {

        // Ex1: Break statement
        String[] animals = { "Dog", "Cat", "Lizard" };

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].equals("Lizard")) {
                break;
            }
            System.out.println(animals[i]);
        }

        /*
         * Using Labels with break statements
         * - Labels with variables can be used as blocks
         * - Labels for loops can be directly assigned in-front of loop
         */

        // Ex1: the block is labeled as myLabel and a variable inside
        myLabel: {
            int number[] = { 1, 2, 3, 4, 5, 6 };
        }

        // Ex2: Following is not allowed
        // myLabel: int[] numbers = { 1, 2, 3, 4, 5, 6 };// Doesn't compile

        // Ex3: Using labels with loops(foreach)
        myLoop: for (String animal : animals) {

            // Stopping the loop using label (myLoop)
            if (animal.equals("Cat")) {
                break myLoop;
            }
            System.out.println(animal);
        }

        // Ex4: confusing examples - using the same name for the variable and label.
        // This is a valid scenario.
        animal: for (String animal : animals) {

            if (animal.equals("Dog")) {
                break animal;
            }

            System.out.println(animal);
        }

        // Ex5: while loop
        System.out.println();
        System.out.println("While loop example");
        int index = 0;
        myWhileLoop: while (true) {

            if (index == animals.length) {
                break myWhileLoop;
            }

            System.out.println(animals[index]);
            index++;
        }

    }
}
