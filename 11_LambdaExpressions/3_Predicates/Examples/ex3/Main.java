import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.removeIf(s -> s.isEmpty());
        // list.removeIf(s->{s.isEmpty()}); // INVALID
        list.removeIf(s -> {
            return s.isEmpty();
        });
        // list.removeIf(String s -> s.isEmpty()); // INVALID
        list.removeIf((String s) -> s.isEmpty());

    }
}
