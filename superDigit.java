/*PARAMETER: string n: a string representation of an integer
*             int k: the times to concatenate n to make p
*RESULT:    Complete the function superDigit in the editor below. 
*           It must return the calculated super digit as an integer.
*           int: the super digit of  repeated  times
*EXAMPLE: n = 9875
          k = 4
          The number p is created by concatenating the string
          n k times so the initial 
          p = 9875987598759875.
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
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

 int sum = superDigit(n);
        int r = sum * k;
        return superDigit(String.valueOf(r));
    }

    private static int superDigit(String n) {

        char[] array = n.toCharArray();
        int sum = 0;
        for (char d : array) {
            if (d == '9') {
                continue;
            }
            sum += d - 48; // If we take '3' (ASCII code 51) and subtract '0' (ASCII code 48), we'll be left with the integer 3
            if(sum < 10){
                continue;
            }
            sum = superDigit(String.valueOf(sum));
        }
        return sum == 0 ? 9 : sum ;
    }