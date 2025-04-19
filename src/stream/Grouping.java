package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Customer> cs = new ArrayList<>();
        cs.add(new Customer(1,"Pijush","123"));
        cs.add(new Customer(1,"Pijush","123"));
        cs.add(new Customer(1,"Pijush","123"));
        cs.add(new Customer(1,"Ari","567"));
        cs.add(new Customer(1,"Ari","567"));

        Map<String, Long> collect = cs.stream().collect(Collectors.groupingBy
                        (Customer::getMobile, Collectors.counting()));
        Long max = Collections.max(collect.values());

        String s = "6298340839";
        Pattern p = Pattern.compile("^[6-9][0-9]{0}");
        Matcher m = p.matcher(s);
        System.out.println(m.find() && m.group().equals(s));
    }
}
