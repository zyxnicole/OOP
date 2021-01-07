package exercise7;

import java.util.function.Predicate;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: count the number of prime integers
 **/

public class PrimeNumber implements Predicate<Integer> {
    public boolean test(Integer num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
