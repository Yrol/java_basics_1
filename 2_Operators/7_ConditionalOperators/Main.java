public class Main {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        System.out.println("d=" + d);

        boolean e = a || b; // true
        System.out.println("e=" + e);

        // Ex: 1
        int f = 4;
        boolean g = false && (f++ < 4); // the second oprand:(f++ < 4) will never be executed since first (left side) is
                                        // false, hence "f" value will remain 4 and will not be incremented. "g" will be
                                        // false
        boolean h = (f-- == 4) && !g; // since its post --, variable "f" will be used first and then decrement
                                      // (f=3),left side will be evaluated to true and !g == true. "h" will be true.
        System.out.println("f=" + f);
        System.out.println("g=" + g);
        System.out.println("h=" + h);

        // Ex: 2
        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);

        // Solution
        // A => (myInt <= 3) = true
        // B => (anotherInt-- == 4) = true // anotherInt = 3
        // A && B == true
        // C => (myInt++ == 4) // WON'T BE evaluated since A && B is true in (A & B)||C.
        // myInt will remain 3
        // myBoolean == true

        System.out.println("myInt=" + myInt);
        System.out.println("anotherInt=" + anotherInt);
        System.out.println("myBoolean=" + myBoolean);

        // Ex: 3 - Valid question but cannot compile due to (ˆ) symbol
        // boolean x = true, z = false;
        // int y = 20;
        // x = (y != 10) ˆ (z = false);

        // Solution
        // A -> (y != 10) = true
        // B -> (z = false) = false
        // A ˆ B = true
        // x = true
    }
}
