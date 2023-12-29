/*PARAMETER:  -int n: the number of empty arrays 
                to initialize in arr
              -string queries[q]: query strings that contain 
                3 space-separated integers
 *             -declare a 2-dimensional array,arr, of n empty arrays. 
 *             -all arrays are zero indexed.
               -declare an integer,lastAnswer , and initialize it to 0.
 * RESULT:   int[]: the results of each type 2 query in the order they 
 *           are presented
 * EXAMPLE:
 *          Input
 *          2 5
            1 0 5
            1 1 7
            1 0 3
            2 1 0
            2 1 1

           Output
            7
            3
  PSEUDOCODE:
*/import java.io.*;
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
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
        int lastAnswer = 0;
        List<Integer> answer = new ArrayList<>();
        Map<Integer, List<Integer>> arr = new HashMap<>(n);
        for (List<Integer> query : queries) {
            int idx = (query.get(1) ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                arr.computeIfAbsent(idx, k -> new ArrayList<>()).add(query.get(2));
            } else {
                List<Integer> sequence = arr.get(idx);
                if (sequence != null) {
                    lastAnswer = sequence.get(query.get(2) % sequence.size());
                    answer.add(lastAnswer);
                }
            }
        }
        return answer;

    }

}