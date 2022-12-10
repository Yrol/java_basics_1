public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = sb1.append("Java"); // append() will return the same StringBuilder - sb1

        System.out.println("sb1 == sb2:" + (sb1 == sb2)); // false
        System.out.println("sb1 == sb3:" + (sb1 == sb3)); // true

        String x = "Java";
        String y = "Java";

        System.out.println("x == y:" + (x == y));// true - since "Java" exists and will be picked up from the String
                                                 // Pool

        String a = "Java";
        String b = "Java ".trim();
        System.out.println("a == b:" + (a == b)); // false - since result of trim() will return a new String

        String c = "Java";
        String d = "Ja";
        String e = "Ja" + "va";
        String f = d + "va";

        System.out.println("c == e:" + (c == e)); // true - since both "Ja" + "va" are literals in "e"
        System.out.println("c == f:" + (c == f)); // false - since in d + "va", d is a var not a literal
    }
}
