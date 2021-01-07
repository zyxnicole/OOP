package exercise7;

import java.util.Arrays;
import java.util.List;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: find the maximal element in the range [begin, end) of a list
 **/

public class FindMaxTest {
    public static <T extends Object & Comparable<? super T>> T findMax(List<? extends T> list, int from, int to) {
        T maxElement = list.get(from);
        for (int i = from + 1; i < to; i++) {
            if (maxElement.compareTo(list.get(i)) < 0) {
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 3, 2, 6, 7, 8, 5, 3);
        int max = findMax(list, 0, 8);
        System.out.println("The max number is: " + max);
    }
}
