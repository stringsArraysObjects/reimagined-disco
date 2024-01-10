/*PARAMETERS:*/
/*RESULT: calculate the absolute difference between the sums*/ 
/*         of its diagonals*/
/* EXAMPLE:  123*/
/*          456*/
/*          989 */          
/*   right to left diagonal = 3 + 5 + 9 = 17. */ 
/*  Their absolute diffreence is |15 - 17 | = 2 */
/* PSEUDOCODE:  complete the diagonalDifference */
/* function in the editor .  The first line contains*/
/* a single integer, n, the number of rows and columns */
/*  in the square matrix arr. Each of the next n lines */
/* describes a row, arr[i], and consists of n space-separated */
/* integers arr[i][j] */

import java.util.*;

class Result {

    /*public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalFisrt = 0;
        int diagonalSecond = 0;
        
        for(int i = 0; i < arr.size(); i++){
            diagonalFisrt += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            diagonalSecond += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(diagonalFisrt - diagonalSecond);
        */

public static int diagonalDifference(List<List<Integer>> arr) {
    int diagonalOne = 0;
    int diagonalTwo = 0;
    for (int i=0; i<arr.size(); i++){
        diagonalOne += arr.get(i).get(i);
        diagonalTwo += arr.get(i).get(arr.size()-1-i);
    }
    int difference = Math.abs(diagonalOne-diagonalTwo);
    return difference;
    }

}

