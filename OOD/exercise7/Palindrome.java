package exercise7;

import java.util.function.Predicate;

/**
 * Program: INFO5100
 * CreatedBy: Nicole_Z
 * CreatDate: 12/08/2020
 * Description: count the number of palindrome
 **/

public class Palindrome implements Predicate<String> {
    public boolean test(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
