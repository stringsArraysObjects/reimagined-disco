/*PARAMETERS: int s[n]: the numbers on each of the squares of chocolate
                int d: Ron's birth day
                int m: Ron's birth month
  RESULT: Lily wants to find segments summing to Ron's
            birthday, d = 4 with a length equalling his birth 
            month, m = 2.  In this case, there are two segments
            that meet her criteria [2,2] and [1,3].
            Returns the int: number of ways the bar
            can be divided.
  EXAMPLE: s = [2,2,1,3,2]
           d = 4
           m = 2
  PSEUDOCODE: identify the numbers on each segment
               identify the length of the list 
               compare the length of the list to Ron's birth month
               find segments that sum to Ron's birthday
               count the number of occurances that meet the criteria
               return the number of occurances.
               create sublist list.sublist(fromIndex, toIndex)idiom removes
               a range of elements from a list.
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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int numOfOccurances = 0;
        int maxNumberOfSections = s.size() - m + 1;
        for (int i = 0; i < maxNumberOfSections; i++) {
            if (s.subList(i, i + m).stream().mapToInt(value -> value).sum()== d) {
                numOfOccurances++;
            }
        }
        return numOfOccurances;
    }
    

}

