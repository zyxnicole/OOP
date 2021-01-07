package exercise7;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: Count the number of elements in a collection that have a specific property
 **/

public class Counter {
    public <T> int count(Collection<T> c, Predicate<T> p) {
        int counter = 0;
        for (T elem : c) {
            if (p.test(elem)) {
                counter++;
            }
        }
        return counter;
    }

}
