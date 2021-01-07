package exercise7;

import java.util.Arrays;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: exchange the positions of two different elements in an array.
 **/

public class ExchangeTest {
    public <T> void swap(T[] a, int i, int j) {
        System.out.println("Change position: " + i + " and " + j);
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        ExchangeTest exchange = new ExchangeTest();
        Integer[] a = {1, 2, 3, 4};
        System.out.println("Original array: " + Arrays.toString(a));
        exchange.swap(a, 0, 3);
        System.out.println("After swap: " + Arrays.toString(a));
    }
}
