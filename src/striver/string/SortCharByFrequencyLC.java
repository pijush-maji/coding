package striver.string;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharByFrequencyLC {

    static String fun(String s){
        Map<Character,Integer> mp = new HashMap<>();
        for(Character c: s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        LinkedHashMap<Character, Integer> res = mp.entrySet()
                .stream()
                .sorted((m1,m2)->m2.getValue().compareTo(m1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (m1, m2) -> m1, LinkedHashMap::new
                ));
        StringBuilder sb = new StringBuilder();
        res.forEach((c, fr) -> sb.append(String.valueOf(c).repeat(fr)));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fun("Aabb"));
    }
}
