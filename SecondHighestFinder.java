import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.EMPTY_LIST;

/**
 * Problem Statement
 * Write a Java program to find the second-highest number in a list of integers.
 * The input list may contain duplicates, and the program should ignore duplicates when determining the second-highest
 * number. If the list has fewer than two distinct elements, the program should return an appropriate message or a null
 * value.
 * <p>
 * Example 1:
 * Input: [10, 15, 20, 15, 5]
 * Output: 15
 * <p>
 * Example 2:
 * Input: [5, 5, 5, 5]
 * Output: No second-highest number found
 * <p>
 * Example 3:
 * Input: [100]
 * Output: No second-highest number found
 * <p>
 * Example 4:
 * Input: []
 * Output: No second-highest number found
 */
public class SecondHighestFinder {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(100, 15, 29, 95, 5, 1, 11);
        List<Integer> numbers2 = List.of(5, 5, 5, 5);
        List<Integer> numbers3 = List.of(10);


        System.out.println(findSecondHighest(numbers1));
        System.out.println(findSecondHighest(numbers2));
        System.out.println(findSecondHighest(numbers3));
        System.out.println(findSecondHighest(EMPTY_LIST));
    }

    public static String findSecondHighest(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return "No second-highest number found";
        }

        Optional<Integer> secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


        return secondHighest
                .map(String::valueOf)
                .orElse("No second-highest number found");
    }
}
