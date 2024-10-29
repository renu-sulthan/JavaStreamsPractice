import java.util.Arrays;
import java.util.List;

public class FindSumOFNumbers {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("5", "9", "3", "7", "100");
        System.out.println("given list " + numbers);
        sumOfAllNumbers(numbers);
    }

    private static void sumOfAllNumbers(List<String> numbers) {
        int sum = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Total sum is: " + sum);
    }
}