/*
 * Static classes cannot be imported when they are in the default package. Must be package them in a unique or different package.
 * Run this project (StaticImports) as a separate project in order to make static imports work.
 */

// importing a custom static class from a different package
import static settings.Config.*;

// importing a java static class
import static java.util.Date.*;

class Main {

    public static void main(String[] args) {

        // Using Java static libraries (Math) without import
        int min = Math.min(300, 20);
        System.out.println(min);
        System.out.println(Math.PI);

        // Using Java static libraries with import
        String strDate = "Thu Jun 18 20:56:02 EDT 2009";
        System.out.println(parse(strDate));

        // Custom static class in a different package (settings)
        printConfig();
        System.out.println("NAME:" + NAME);
    }
}