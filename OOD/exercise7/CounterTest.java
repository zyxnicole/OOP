package exercise7;

import java.util.Arrays;
import java.util.List;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description:
 **/

public class CounterTest {

    Counter counter;
    CounterTest(){
        counter = new Counter();
    }
    public void testOddNumCount(List<Integer> list){
        int num = counter.count(list, new OddNumber());
        System.out.println("Number of odd integers:" + num);
    }
    public void testPrimeNumCount(List<Integer> list) {
        int num = counter.count(list, new PrimeNumber());
        System.out.println("Number of prime integers:" + num);
    }
    public void testPalindrome(List<String> list) {
        int num = counter.count(list, new Palindrome());
        System.out.println("Number of prime palindrome:" + num);
    }




    public static void main(String[] args) {
        CounterTest test = new CounterTest();
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
        List<String> strList = Arrays.asList("ada", " test", "taco", "ss");
        test.testOddNumCount(intList);
        test.testPrimeNumCount(intList);
        test.testPalindrome(strList);

    }
}
