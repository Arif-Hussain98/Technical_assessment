import java.util.*;
import java.io.*;
import java.lang.*;

public class QuestionNo1
{
	public static int maxActivities(int start[], int end[], int total)
	{
	    int count;
        if(total>0){
            Arrays.sort(end);
            int i=0, j;
            count = 1;
        	for (j = 1; j < total; j++)
        	{
        		if (start[j] >= end[i])
        		{
        			count++;
        			i = j;
        		}
        	}
        	return count;
        }
        else{
            return count = 0;
            }
	}

	public static void main(String[] args)
	{
    	int start[] = {2, 1};
        int end[] = {2, 2};
    	int total = start.length;
    		
    	int result = maxActivities(start, end, total);
    	System.out.println(result);
	}
	
}