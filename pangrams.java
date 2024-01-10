/*PARAMETERS: string s: a string to test
 * RESULT: return a the string pangram if input string
 *          is a pangram.  Otherwise, is hould return not
 *          pangram.
 * EXAMPLE: Sample Input 0
            We promptly judged antique ivory 
            buckles for the next prize.
            Sample Output 0
            pangram.
    PSEUDOCODE: use the set interface(cannot contain duplicate elements) to declare
                a new HashSet(Class) to collect the passed arguement as 
                lowercase characters in an Array.
                Iterate using forEach
                use a ternary statement to evaluate the characters in the set/string.
                return the result as reqested.
                
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
     Set<Character> alphabet = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) 
                alphabet.add(c);
        }
        return alphabet.size() == 26 ? "pangram" : "not pangram";
    }

}