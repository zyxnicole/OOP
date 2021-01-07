package exercise7;

import java.util.function.Predicate;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: count the number of odd integers
 **/

public class OddNumber implements Predicate<Integer> {
    public boolean test(Integer i) {
        return i % 2 != 0;
    }
}
