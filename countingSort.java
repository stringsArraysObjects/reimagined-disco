/*PARAMETERS:   Complete the countingSort function in the editor below.
                countingSort has the following parameter(s):
                arr[n]: an array of integers.
                For this exercise, always return a frequency 
                array with 100 elements.
RESULT: Given a list of integers, count and return the number of times each 
         value appears as an array of integers.  
EXAMPLE: arr = [1, 1, 3, 2, 1]All of the values are in the range
        [0,...3]so create an array of zeros, result =[0,0,0,0]
        The results of each iteration follow:
        i	arr[i]	result
        0	1	[0, 1, 0, 0]
        1	1	[0, 2, 0, 0]
        2	3	[0, 2, 0, 1]
        3	2	[0, 2, 1, 1]
        4	1	[0, 3, 1, 1]
        The frequency array is [0,3,1,1] 
        These values can be used to create the sorted array as well: 
        [1,1,1,2,3]    
PSEUDOCODE: need to iterate through the list and count the 
            the frequency of duplicate elements. produce a new
            list array that show the count sorted in ascending 
            order.
            ArrayList() Constructs an empty list with an initial capacity of ten.
            Collections iterate over the list with a for loop 
            frequency(Collection<?> c,Object o)
            Returns the number of elements in the specified collection equal to the specified object. 
            Parameters:
                c - the collection in which to determine the frequency of o
                o - the object whose frequency is to be determined
                Returns:
                the number of elements in c equal to o
                Throws:
                NullPointerException - if c is null           

             */
import java.util.*;
import java.util.List;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    import java.util.ArrayList;
    import java.util.List; 
    
    
    public static List<Integer> countingSort(List<Integer> arr) {
    List values = new ArrayList(); 
        for(int i=0;i<100;i++){ 
            values.add(Collections.frequency(arr,i)); 
        }
        return values;
    }
}
    