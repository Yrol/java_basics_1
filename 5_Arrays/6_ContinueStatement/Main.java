public class Main {

    /*
     * Continue statement will jump to the next iteration (skipping the rest)
     * immediately of the loop
     * Continue statement can only be used with loops (not with if or switch
     * conditions)
     */

    public static void main(String[] args) {

        // Ex1: Elephant won't be printed
        String animals[] = { "Rabbit", "Elephant", "Wolf", "Kangaroo" };

        for (String animal : animals) {

            if (animal == "Elephant") {
                continue;
            }

            System.out.println(animal);
        }

        // Ex2: with labels
        MY_LOOP: for (String animal : animals) {

            if (animal == "Wolf") {
                continue MY_LOOP;
            }

            System.out.println(animal);
        }

        // Ex3: label with same name as variable
        animal: for (String animal : animals) {
            if (animal == "Rabbit" || animal == "Elephant") {
                continue animal;
            }

            System.out.println(animal);
        }

        // ex4: continue with while loop
        System.out.println();
        System.out.println("Continue with while loop and label");
        int index = 0;
        animal: while (index < animals.length) {
            // index++; // not appropriate since it'll always start with index 1 not 0.
            if (animals[index] == "Elephant") {
                index++; // IMPORTANT - if not incremented will go into an infinite loop because index
                         // will always remain in Elephant array value index
                continue animal;
            }

            System.out.println(animals[index]);
            index++;
        }

    }
}
