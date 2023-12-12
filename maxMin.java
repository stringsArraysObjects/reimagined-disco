/*PARAMETERS: You will be given a list of integers, arr,
                and a single integer k:
                                    the number of elements to selct.
               
                Call that array arr[n]:: 
                                    an array of integers.
                
 * RETURN:    You must create 
              an array of length k from elements of arr such 
              that its unfairness is minimized 
              Unfairness of an array
                 is calculated as max(arr1) - min(arr1)
                Where:
                 - max denotes the largest integer in 
                - min denotes the smallest integer in 
              Return the int:
                the minimum possible unfairness.
 * EXAMPLE:  arr = [1,4,7,2]
 *           k= 2
 *           Pick any two elements,
 *           say arr1 = [4,7].
 *           unfairness = max(4, 7) - min(4,7) = 7 - 4 =3
 * PSEUDOCODE: Class interface comparator static naturalOrder method
 *              returns a comparator that compares comparable objects
 *              in natural order.
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
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
     arr.sort(Comparator.naturalOrder());
        List<Integer> unfairness=new ArrayList<>();
        for (int i=0; i+k-1<arr.size();i++)
            unfairness.add(arr.get(i+k-1)-arr.get(i));
        return unfairness.stream().min(Integer::compareTo).get();
    }

    

}