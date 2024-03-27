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
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
     Map<Integer, Long> sum = new TreeMap<>();    
    for (List<Integer> list: queries) {
        int a = list.get(0);
        int b = list.get(1);
        long k = list.get(2);
        sum.put(a, sum.getOrDefault(a, 0L) + k);
        sum.put(b + 1, sum.getOrDefault(b + 1, 0L) - k);
    }

    long max = 0L;
    long current = 0L;
    for(long value: sum.values()) {
        current += value;
        max = Math.max(max, current);
    }
    return max;
}

}   


