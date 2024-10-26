import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> evenNumbers = filterEvenNumbers();
        System.out.println("Filtered even numbers list: " + evenNumbers);
    }

    private static List<Integer> filterEvenNumbers() {
        List<Integer> numbers = List.of(25, 34, 17, 29, 42, 8, 51, 76, 63, 5, 19, 45, 82, 31, 48, 91, 12, 77, 64, 39);
        System.out.println("Before Filtering: " + numbers);
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }
}