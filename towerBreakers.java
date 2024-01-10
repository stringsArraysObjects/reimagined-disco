/*PARAMETERS: Int n: the number of towers
              int m: the height of each tower
RESULT:       Given the values of n and m , 
              determine which player will win.
              If the first player wins, return 1. 
              Otherwise, return 2.
EXAMPLE:      Sample Input
              STDIN   Function
              -----   --------
              2       t = 2
              2 2     n = 2, m = 2
              1 4     n = 1, m = 4
              Sample Output:
              2
              1

PSEUDOCODE: which ever player is the last to make a move
            that doesn't have a zero remainder they will lose.
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
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
    return (n % 2 == 0 || m == 1) ? 2: 1;
    }

}

