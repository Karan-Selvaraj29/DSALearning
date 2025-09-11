import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .filter(name -> name.length() > 3) // Intermediate operation
                .forEach(System.out::println);     // Terminal operation
    }
}
