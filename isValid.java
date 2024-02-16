/*PARAMETERS: A single String s.
*RESULT: Given a string s, determine if it is valid.
*        Return YES if it is valid, otherwise return NO.
*EXAMPLE: s = abc this is a valid string because
*          {a : 1. b : 1, c : 1}.
          s = abccc
          This string is not valid as we can only remove 1
          occurrence of c. That leaves character frequencies of
          {a : 1, b : 1, c : 2} .
*PSEUDOCODE: tally the occurances of differnt chars.
             if any one char occurs 3 or more times
             return No. 
             Two or less return YES.
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
public static String isValid(String s) {
        if(s.length()==1) return "YES";
        Map<Character, Integer> map = new HashMap<>();
     
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        if(list.get(0)==1){
            
            return  list.get(1)!=Collections.max(list) ?"NO" :"YES";
        
        else if(Collections.max(list) - Collections.min(list)>1) return "NO";
        
        return "YES";
    }

//this one doesn't pass all  the tests
public static String isValid(String s) {
     int letter = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == s.charAt(i++)){
                letter++;
            }
        }
        if(letter > 2 ){
           return "NO";
        }else if (letter-1 == 2){
           return "YES";
        }else{
            return "NO";
        }
        
    }
}
