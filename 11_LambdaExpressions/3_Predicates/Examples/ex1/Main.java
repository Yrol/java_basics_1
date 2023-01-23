import java.util.function.Predicate;

class Cat {
    int age;
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 1;
        // check(cat, cat -> cat.age < 5); // compiler error, cat cannot be reused as
        // the second parameter.
        check(cat, c -> cat.age < 5);
    }

    private static void check(Cat cat, Predicate<Cat> pred) {
        String result = pred.test(cat) ? "match" : "not match";
        System.out.println(result);
    }
}
