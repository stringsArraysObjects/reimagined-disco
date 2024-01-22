/*PARAMETER: int n the initial game counter value
             Louise always starts.
*RESULT: Whoever reduces the number by to 1 using 
         power of 2 wins the game.
*EXAMPLE: n =132
            It's Louise's turn first. 
            She determines that 132 is
            not a power of 2 . The next 
            lower power of 2 is 128 , 
            so she subtracts that from 132
            and passes 4 to Richard. 4 is a
            power of 2, so Richard divides 
            it by 2 and passes 2 to Louise. 
            Likewise, 2 is a power of 2,
            so she divides it by 2 and reaches 1.
            She wins the game.
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
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */
//     beautiful solution, wish it was mine.  Mine would only pass 6 of the tests. Learn and grow
    public static String counterGame(long n) {
        return ((Long.bitCount(n-1) & 1) == 0) ? "Richard" : "Louise";

    }

}

