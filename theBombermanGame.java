/*PARAMETERS:   int n: the number of seconds to simulate
                string grid[r]: an array of strings 
                that represents the grid
*RESULT:        string[r]: n array of strings that represent 
                the grid in its final state
*EXAMPLE: because of formating examples not available
*/

//This is part solution that I found.
//  This is not my code, so I am not submitting the
//  entire solution.
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
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Return the original grid
        if(n == 1)
            return grid;

        // Return a grid of all 'O'
        if(n % 2 == 0)
            return grid.stream()
                    .map(str -> str.replaceAll(".", "O"))
                    .collect(Collectors.toCollection(ArrayList::new));

        // The grid only needs to be flipped 2 or 3 times.
        // All flips after that are a repeat of flip 2 and 3.
        int numOfTimesFlipped = (n - 1) / 2;
        if(numOfTimesFlipped > 3) {
            if(numOfTimesFlipped % 2 == 0)
                numOfTimesFlipped = 2;
            else 
                numOfTimesFlipped = 3;
        }