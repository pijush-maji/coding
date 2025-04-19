package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean,List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(x->x%2==0));
        partition.get(true).forEach(System.out::println);
        partition.get(false).forEach(System.out::println);
    }
}
