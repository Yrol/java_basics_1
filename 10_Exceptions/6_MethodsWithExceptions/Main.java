
// Custom exception - checked (extends Exception)
class NoMoreMeatException extends Exception {

}

// Custom exception - Unchecked (extends RuntimeException)
class NoMorePlantsExceptions extends RuntimeException {

}

interface Ominivore {

    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);

}

class Bear implements Ominivore {

    /*
     * Overriding the eatMeat method
     * - The NoMoreMeatException can be declared or handled for eatMeat method
     */

    // Valid - Handling the exception
    // @Override
    // public void eatMeat(int amount) {
    // if (amount <= 0) {

    // try {
    // throw new NoMoreMeatException();
    // } catch (NoMoreMeatException e) {

    // }
    // }
    // System.out.println("Eating meat");
    // }

    // Declaring the exception (handling ot declaring is must since its a checked.
    // exception)
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if (amount <= 0) {
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat");
    }

    // No need to handle or declare NoMorePlantsExceptions since its unchecked.
    @Override
    public void eatPlants(int amount) {
        if (amount <= 0) {
            throw new NoMorePlantsExceptions();
        }

        System.out.println("Eating plant");
    }
}

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();

        // bear.eatMeat(0); // Won't compile since the method is not handled

        /*
         * Scenario 1
         */

        // Need to handle here since not handled in eatMeat overridden method
        // try {
        // bear.eatMeat(0);
        // } catch (NoMoreMeatException e) {
        // System.out.println(e.getMessage());
        // } finally {
        // System.out.println("Finally");
        // }

        // // No need to handle or declare NoMorePlantsExceptions since its unchecked.
        // bear.eatPlants(0);

        /*
         * Scenario 2
         */
        try {
            bear.eatMeat(5);
            bear.eatPlants(-2);
        } catch (NoMoreMeatException e) {
            System.out.println("Meat error");
            // } catch(RuntimeException e) { // Invalid as NoMorePlantsExceptions is a child
            // of RuntimeException and it needs to be handled before parents

        } catch (NoMorePlantsExceptions e) {
            System.out.println("Plant error");
        } catch (RuntimeException e) { // Won't reach in case of NoMorePlantsExceptions is occurred.
            System.out.println("Runtime exception");
        } finally {
            System.out.println("Finally");
        }

    }
}
