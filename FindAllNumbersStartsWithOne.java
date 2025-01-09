
// Find out all the numbers starting with 1 using Stream functions?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersStartsWithOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired number of elements wanted in the list: ");
        int listSize = sc.nextInt();
        System.out.println("Enter elements into list: ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("\nNumbers starts with one are: ");
        numbers.stream()
                .map(n -> Integer.toString(n))
                .filter(s -> s.startsWith("1"))
                .forEach(numberStartWithOne -> System.out.print(numberStartWithOne + ", "));
    }
}
