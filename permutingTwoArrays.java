/* PARAMETER:   There are to n-elements arrays of 
                integers, A and B.  Permute them into some A'
                and B' such that the relation A'[i] + B'[i] 
                less than or equal to k holds for all i where 0
                is less than or equal to i and i is less than n
                 int k: an integer
                 int A[n]: an array of integers
                 int B[n]: an array of integers
                 returns a string either YES or NO
    RESULT:     There will be q queries consisting of 
                A, B, and k. For each query, return YES if 
                some permutation A',B' satisfying the relation exists. 
                Otherwise, return NO. 
    EXAMPLE:    A = [0,1]
                B =[0,2]
                k = 1 */ 
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
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    
    
    

        /**
         * @param k
         * @param A
         * @param B
         * @return
         */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    
    boolean isPermut = true;
    
    A.sort((a, b) -> a.compareTo(b));
    B.sort((a, b) -> b.compareTo(a));
    
    for(int i = 0; i < A.size(); i++){  
        if(A.get(i) + B.get(i) < k){
            isPermut = false;
        }
    }
    
    return isPermut ? "YES" : "NO";

  }

}
// public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
//     boolean result = true;
//     A.sort(Comparator.naturalOrder());
//     B.sort(Comparator.reverseOrder());
//     for (int i = 0; i < A.size(); i++) {
//         if (A.get(i) + B.get(i) < minSum) {
//             result = false;
//             break;
//         }
//     }
//     return result ? "YES" : "NO";
// }