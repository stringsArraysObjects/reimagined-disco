/*PARAMETERS:Given an array of  distinct integers, 
                transform the array into a zig zag 
                sequence by permuting the array elements.
 *RESULT: A sequence will be called a zig zag sequence if 
            the first  elements in the sequence are in 
            increasing order and the last  elements are
             in decreasing order, where . You need to find 
             the lexicographically smallest zig zag sequence
              of the given array.
  EXAMPLE: a = [2,3,5,1,4] Now if we permute the array as 
              [1,4,5,3,2] , the result is a zig zag sequence.

 */
    /*not my solution */
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2; // Modified
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2; // Modified
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; //Modified
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
