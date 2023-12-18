/*PARAMETER: Given an array of integers representing the color of each sock, 
             determine how many pairs of socks with matching colors there are.
             int n: the number of socks in the pile
             int ar[n]: the colors of each sock 
  RESULT:    int: the number of pairs
  EXAMPLE: n = 7
           ar = [1,2,1,2,1,3,2]
           There is one pair of color 1 
           and one of color 2. There are
           three odd socks left, one of 
           each color. The number of pairs is 2.
  PSEUDOCODE: using the length of the array
              find the duplicate numbers
              and put them into pairs
              count the number of pairs
*/

import java.util.HashSet;
import java.util.List;

class Result{
     public static int sockMerchant(int n, List<Integer> ar) {
        HashSet<Integer> socks = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < n; i++) {
            if (!socks.contains(ar.get(i))) {
                socks.add(ar.get(i));
            } else {
                pairs++;
                socks.remove(ar.get(i));
            }
        }
        
        return pairs;
    }

}


