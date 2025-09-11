import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Eve", "David");

        List<String> processedNames = names.stream()
                .filter(name -> name.length() > 3)                      // Keep names longer than 3 characters
                .distinct()                                             // Remove duplicates
                .map(String::toUpperCase)                               // Convert to uppercase
                .peek(name -> System.out.println("After map: " + name)) // Debugging with peek
                .sorted()                                               // Sort alphabetically
                .collect(Collectors.toList());                          // Collect result

        System.out.println("Final List: " + processedNames);

        // flatMap example — flattening a list of lists
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        List<Integer> flatList = nestedNumbers.stream()
                .flatMap(List::stream)      // Flatten nested lists into one stream
                .collect(Collectors.toList());

        System.out.println("Flat List: " + flatList);
    }
}
