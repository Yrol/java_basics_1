interface Jump {
    boolean isTooHigh(int height, int limit);
}

public class Main {
    public static void main(String[] args) {
        // check((h, 1) -> h.apppend(1).isEmpty(), 5); // compiler error, cannot call
        // "h.apppend(1).isEmpty()" since h is an int.
    }

    private static void check(Jump jump, int height) {
        if (jump.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}