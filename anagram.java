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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
       HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        HashMap<Character,Integer> b = new HashMap<Character,Integer>();
        if(s.length()%2!=0)
            return -1;
        int ans=0;
        char c;
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        String s3="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(a.containsKey(c))
                a.put(c,a.get(c)+1);
            else
                a.put(c,1);
        }
        for(int i=0;i<s2.length();i++)
        {
            c=s2.charAt(i);
            if(b.containsKey(c))
                b.put(c,b.get(c)+1);
            else
                b.put(c,1);
        }
        for(int i=0;i<s3.length();i++)
        {
            c=s3.charAt(i);
            if(a.containsKey(c) && b.containsKey(c))
                ans+=Math.min(a.get(c),b.get(c));
        }
        return s1.length()-ans;
        
    }
}