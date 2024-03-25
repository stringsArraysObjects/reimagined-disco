/*PARAMETERS:   int arr[n]: an array of integers
*RESULT:        return the maximum subarray and subsequence sums
*EXAMPLE:       The maximum subarray sum is comprised of elements
*                at inidices[1-5] . Their sum is 2+3+-4+5+10 = 16.  
                The maximum subsequence sum is comprised of elements 
                at indices[1,2,4,5] and their sum is 2+3+5+10 = 20.
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
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    
        int maxArr = Integer.MIN_VALUE;
        int maxSeq = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer value : arr) {
            sum = Math.max(value, sum + value);
            maxArr = Math.max(maxArr, sum);
            if (value > 0) {
                maxSeq = Math.max(maxSeq + value, value);
            } else {
                maxSeq = Math.max(maxSeq, value);
            }
        }
        return List.of(maxArr, maxSeq);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
