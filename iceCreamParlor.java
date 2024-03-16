/*PARAMETER: int m: the amount of money they have to spend
*            int cost[n]: the cost of each flavor of ice cream 
*RESULT:     Given a list of prices for the flavors of ice cream,
*            select the two that will cost all of the money they have.
*EXAMPLE:    m = 6
*            cost = [1,3,4,5,6]
*            The two flavors that cost 1 and 5 meet the criteria.  Using
*            1-based indexing, they are at 
*            indices 1 and 4.
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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>(2);
        int[] contained = new int[m + 1];
        Arrays.fill(contained, -1);
        for (int i = 0; i < arr.size(); i++) {
            Integer num = arr.get(i);
            if (num > m) continue;
            int diff = m - num;
            if (contained[diff] > -1) {
                result.add(contained[diff] + 1);
                result.add(i + 1);
                break;
            }
            if (contained[num] == -1) {
                contained[num] = i;
            }
        }
        return result;
    }

}


public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
         Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i<arr.size(); i++){
            int temp = m - arr.get(i);
            if(!map.containsKey(temp)){
                map.put(arr.get(i), (i+1));
            }else{
                for(int key : map.keySet()){
                    if(key == temp){
                        ans.add(map.get(key));
                        ans.add(i+1);
                        return ans;
                    }
                }
            }
        }
        return ans;
    }