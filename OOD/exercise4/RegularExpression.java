package exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/18/2020
 **/

public class RegularExpression {
    public static void testRegex(String pattern, String positive, String negative) {
        System.out.println("---------------Test start----------------");
        assertMatch(pattern, positive);
        assertMatch(pattern, negative);
    }

    public static void assertMatch(String pattern, String matcher) {
        System.out.println("Pattern: " + pattern);
        System.out.println("Matcher: " + matcher);
        if (Pattern.matches(pattern, matcher)) {
            System.out.println("Matches!");
        } else {
            System.out.println("Doesn't match!");
        }
    }


    public static void main(String[] args) {
        testRegex("[a-z][A-Z][a-z]", "sHe", "She");
        testRegex(".*s.*", "This is a test", "aaaaa");
        testRegex("\\D*", "abcdef", "abc123");
        testRegex("abc", "abc", "abcefg");
        testRegex("^[\\d].*","257ccc","ccc257");
    }

}
