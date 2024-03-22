/*PARAMETER: int h1[n1]: the first array of heights
*            int h2[n2]: the second array of heights
*            int h3[n3]: the third array of heights
*RESULT:     Find the maximum possible height of the 
*            stacks such that all of the stacks are 
*            exactly the same height. This means you
*            must remove zero or more cylinders from 
*            the top of zero or more of the three stacks 
*            until they are all the same height, then return the height.
*EXAMPLE:    h1 = [1,2,1,1]
             h2 = [1,1,2] 
             h3 = [1,1]
             There are 4,3 and 2 cylinders in the three stacks, 
             with their heights in the three arrays. Remove the 
             top 2 cylinders from h1 (heights = [1, 2]) and from 
             h2 (heights = [1, 1]) so that the three stacks all 
             are 2 units tall. Return 2 as the answer.
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
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
     Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();

        int hA = getHeight(h1, A);
        int hB = getHeight(h2, B);
        int hC = getHeight(h3, C);

        boolean equal = false;

        while (!equal) {
            int target = getTarget(hA, hB, hC);
            hA = equalizeStack(A, hA, target);
            hB = equalizeStack(B, hB, target);
            hC = equalizeStack(C, hC, target);
            if (hA == hB && hB == hC) {
                equal = true;
            }
        }

        return hA;

    }

    private static int equalizeStack(Stack<Integer> S, int height, int target) {
        while (height > target) {
            int h = S.pop();
            height -= h;
        }
        return height;
    }

    private static int getTarget(int hA, int hB, int hC) {
        return Math.min(hA, Math.min(hB, hC));
    }

    private static int getHeight(List<Integer> h1, Stack<Integer> A) {
        int n = h1.size();
        int height = 0;
        for (int i = 0; i < n; i++) {
            int h = h1.get(n - i - 1);
            height += h;
            A.push(h);
        }
        return height;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
