package stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        numbersWithDuplicates.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
