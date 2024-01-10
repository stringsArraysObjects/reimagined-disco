/*PARAMETER:  int arr[n]: an array of integers
* RESULT:    You will be given arrays of integers and 
             must determine whether there is an element 
             that meets the criterion. If there is, 
             return a string: either YES or NO
 EXAMPLE: arr = [5, 6,8, 11]
             8 is between two subarrays that sum to 11.
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
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        int totalSum = arr.stream().reduce(0, (a,b)->a+b);
        int sum = 0;
        for (int i: arr){
            if ( i == totalSum - sum * 2) return "YES";
            sum+= i;
        }
        return "NO";
    }
}