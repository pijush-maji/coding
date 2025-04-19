package stream;

import java.util.Arrays;
import java.util.List;

public class PrimeCheck {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPrime() {
        List<Integer> list = Arrays.asList( 4, 6, 8, 10, 12, 14, 15);
        return list.stream().anyMatch(this::isPrime);
    }
}
