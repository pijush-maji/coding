package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntersectionTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);

    }
}
