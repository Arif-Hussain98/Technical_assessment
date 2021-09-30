import java.util.*;
import java.lang.*;
import java.io.*;


public class QuestionNo3
{
    public static void main(String[] args)
    {
        String s = "geeksforgeeks";
 
        int length = longestSubStr(s);
     
        System.out.println(length);
    }
    
    public static int longestSubStr(String s)
    {
        int maximumLen = -1;
        String str = "";
        
        if (s.isEmpty()) {
            return 0;
        }
        else if (s.length() == 1) {
            return 1;
        }
        for (char c : s.toCharArray()) {
            String value = String.valueOf(c);
 
            if (str.contains(value)) {
                str = str.substring(str.indexOf(value)+ 1);
            }
            str = str + String.valueOf(c);
            maximumLen = Math.max(str.length(), maximumLen);
        }
 
        return maximumLen;
    }
}
