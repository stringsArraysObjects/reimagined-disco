/*PARAMETERS:  initial position in the queue from 1 to n.
*              one person can bribe at most two others. 
*              int q[n]: the positions of the people after all bribes.
*RESULT:       determine the minimum number of bribes that took place 
*              to get to a given queue order. Print the number of bribes,
*              or, if anyone has bribed more than two people, 
*              print Too chaotic.
*EXAMPLE:      q = [1,2,3,4,5,6,7,8]
*              If person 5 bribes person 4, the queue will look like
*              this: 1,2,3,5,4,6,7,8. Only 1 bribe is required. Print 1.
*              q = [4,1,2,3]
*              person 4 had to bribe 3 people to get to the current 
*              position. Print Too chaotic.
*PSEUDOCODE:   Its a type of bubble-sort.
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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int counter = 0;
        int temp;
        for (int i = q.size() - 2; i >= 0; i--) {
            int diff = q.get(i) - i - 1;
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
            while (diff > 0) {
                diff--;
                counter++;
                temp = q.get(i + 1);
                q.set(i + 1, q.get(i));
                q.set(i, temp);
                if(diff == 1) i++;
            }
        }
        System.out.println(counter);
    }
}