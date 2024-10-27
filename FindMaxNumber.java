import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 3, 7, 6, 2, 8, 1, 4);
        System.out.println("given list " + numbers);
        sortANdFindMax(numbers);
    }

    private static void sortANdFindMax(List<Integer> numbers) {
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println("Sorted numbers in ascending order: " + sortedNumbers);
        numbers.stream()
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        maxInteger -> System.out.println("Max number is  " + maxInteger),
                        () -> System.out.println("No max found"));
    }
}
