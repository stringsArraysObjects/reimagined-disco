/*PARAMETER: string s: cleartext
             int k: the alphabet rotation factor
  RESULT:    string: the encrypted string
 *           Ceaser's cipher shifts each letter by a number of 
 *           letters. If the shift takes you past the end of the
 *           alphabet, just rotate back to the front of the alphabet. 
 *           In the case of a rotation by 3, w, x, y and z would map 
 *           to z, a, b and c.
 * EXAMPLE: s = There's-a-starman-waiting-in-the-sky
 *          k = 3
 *          The alphabet is rotated by 3, matching the mapping above.
 *          The encrypted string is Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb.
 * PSEUDOCODE: 
 *              Sample Input: 
 *              11
 *              middle-Outz
 *              2
 *              Sample Output:
 *              okffng-Qwvb
 * 
 *              Original alphabet:  abcdefghijklmnopqrstuvwxyz
                Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

                m -> o
                i -> k
                d -> f
                d -> f
                l -> n
                e -> g
                -    -
                O -> Q
                u -> w
                t -> v
                z -> b


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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
     String result = new String("");
        
        for(char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char start = Character.isUpperCase(ch) ? 'A': 'a';
                result += (char) ( start + (ch-start + k) % 26);
            } else {
                result += ch;
            }
        }
        
        return result;
    }
}
