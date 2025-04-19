package stream;

import java.util.*;

public class LongestString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pijush","Ari","Arindam","Sanchaita");
        Optional<String> maxLen = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(maxLen.get());
    }
}
