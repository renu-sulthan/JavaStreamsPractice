import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "apricot", "cherry");
        System.out.println("Before conversion" + names);
        List<String> upperCaseStrings = convertToUpperCaseStrings(names);
        System.out.println("After uppercase conversion" + upperCaseStrings);
    }

    private static List<String> convertToUpperCaseStrings(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .toList();
    }
}
