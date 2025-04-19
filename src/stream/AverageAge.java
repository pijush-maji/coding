package stream;

import java.util.Arrays;
import java.util.List;

public class AverageAge {


    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double avg = persons.stream().mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println(avg);
    }
}
